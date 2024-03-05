//max of 2 numbers
import java.io.*;
class CMax
{
  public static void main(String args[])
  {
	DataInputStream din;
	String s;
	int a,b;
	din = new DataInputStream(System.in);
	try
	{
	 System.out.println("Enter the first no");
	 s = din.readLine();
	 a = Integer.parseInt(s);
	 System.out.println("Enter the second no");
	 s = din.readLine();
	 b = Integer.parseInt(s);
	 if(a > b)
	  System.out.println("Maximum is " + a);
	 else
	  System.out.println("Maximum is " + b);
	}
	catch(Exception e)
	{
	 System.out.println("Error : " + e);
	}
  }
}