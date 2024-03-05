import java.io.*;
import java.net.*;
class LClient
{
	public static int menu() throws Exception
	{
		int ch = 0; 
		DataInputStream din = new DataInputStream(System.in);
		System.out.println("Login -> 1\nRegister -> 2\nQuit -> 3\n Enter your Choice->");
		ch = Integer.parseInt(din.readLine());
		return ch;	
	}
	public static void main(String args[])
	{
		Socket cs;
		String un,pa,sql="",q;
		int ch;
		DataOutputStream sout=null;
		DataInputStream sin,din;

		try
		{
			din = new DataInputStream(System.in);
			cs = new Socket("localhost",1234);
			sin = new DataInputStream(cs.getInputStream());
			sout = new DataOutputStream(cs.getOutputStream());
			String str = "";
			for(ch = menu();ch != 3;ch = menu())
			{
				
				System.out.println("Enter user name ");
				un = din.readLine();
				System.out.println("Enter Password");
				pa = din.readLine();
				if(ch == 2)
					sql = "rinsert into nlogin values('" + un +  "','" + pa + "')";
				else if(ch == 1)
					sql = "lselect * from nlogin where un='" + un +  "' and upass='" + pa + "'";
				sout.writeUTF(sql);
				sql = sin.readUTF();
				System.out.println(sql);
			}
			sout.writeUTF("q");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}