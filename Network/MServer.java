import java.io.*;
import java.net.*;
import java.util.*;

class AClient extends Thread
{
	Socket s;
	DataOutputStream sout;
	DataInputStream sin;

	LinkedList<Socket> ll;
		
	public AClient(Socket as,LinkedList<Socket> l)
	{
		try
		{
			s = as;
			ll = l;
			sin = new DataInputStream(s.getInputStream());
			sout = new DataOutputStream(s.getOutputStream());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void run()
	{
		try
		{
			String str = "Welcome...";
			sout.writeUTF("SER:" + str);
			for(;;)
			{
				
				str = sin.readUTF();
				if(str.equals("quit"))
				{
					sout.writeUTF(str);
					ll.remove(s);
					break;
				}
				System.out.println("Client Says :" + str);
				for(Socket s:ll)
				{
					DataOutputStream d = new DataOutputStream(s.getOutputStream());
					d.writeUTF(str);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class MServer
{
	public static void main(String args[])
	{
		ServerSocket ss;
		LinkedList <Socket> ll = new LinkedList<Socket>();
		try
		{
			ss = new ServerSocket(1234);
			
			for(;;)
			{
			System.out.println("Server : Listening...");
			Socket as = ss.accept();
			ll.add(as);
			AClient obj = new AClient(as,ll);
			obj.start();
			System.out.println("Server : Client Connected...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}