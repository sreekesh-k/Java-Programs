import java.io.*;
import java.net.*;
import java.sql.*;

class AClient extends Thread
{
	Socket s;
	DataOutputStream sout;
	DataInputStream sin;		
	public AClient(Socket as)
	{
		try
		{
			s = as;
			sin = new DataInputStream(s.getInputStream());
			sout = new DataOutputStream(s.getOutputStream());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public String registerUser(String str)
	{
	  try
	  {
		DataBase objdb = new DataBase();
		objdb.idu(str);
		return "From Server : successfully registered..";
	  }
	  catch(Exception er)
	  {
	  }
	  return "From Server : Registration Failure..";
	}
	public String loginUser(String str)
	{
	  try
	  {
		System.out.println(str);
		DataBase objdb = new DataBase();
		ResultSet rs = objdb.select(str);
		if(rs.next())
			return "From Server : You have logged in successfully";
		else 
			return "From Server : Invalide User name or password";
	  }
	  catch(Exception er)
	  {
		System.out.println(er);
	  }
	  return "From Server : Login Failure..";
	}
	public void run()
	{
		try
		{
			String str = "";
			for(;;)
			{
				str = sin.readUTF();
				if(str.equals("q"))
					break;
				else if(str.startsWith("r"))
					str = registerUser(str.substring(1));
				else if(str.startsWith("l"))
					str = loginUser(str.substring(1));
				else
					str = "From Server:" + str;
				sout.writeUTF(str);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class LServer
{
	public static void main(String args[])
	{
		ServerSocket ss;
		try
		{
			ss = new ServerSocket(1234);
			for(;;)
			{
			System.out.println("Server : Listening...");
			Socket as = ss.accept();
			AClient obj = new AClient(as);
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