import java.io.*;
import java.net.*;
class MRead extends Thread
{
	DataInputStream sin;
	public MRead(DataInputStream sin)
	{
		this.sin= sin;
	}
	public void run()
	{
		try
		{
			String str = "";
			for(;;)
			{
				str = sin.readUTF();
				if(str.equals("quit"))
					break;
				System.out.println(str);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class MClient
{
	public static void main(String args[])
	{
		Socket cs;
		DataOutputStream sout;
		DataInputStream sin,din;

		try
		{
			din = new DataInputStream(System.in);
			cs = new Socket("localhost",1234);
			sin = new DataInputStream(cs.getInputStream());
			sout = new DataOutputStream(cs.getOutputStream());
			String str = "";
			MRead objr = new MRead(sin);
			objr.start();
			for(;;)
			{
				System.out.println("Enter data/quit to terminate");
				str = din.readLine();	
				sout.writeUTF(str);
				if(str.equals("quit"))
					break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}