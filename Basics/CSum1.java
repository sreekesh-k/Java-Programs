//add2 numbers without strong into string
import java.io.*;
class CSum1
{
  public static void main(String args[])
  {
	DataInputStream din;
	int a,b;
	din = new DataInputStream(System.in);
	try
	{
	 System.out.println("Enter the first no");
	 a = Integer.parseInt(din.readLine());
	 System.out.println("Enter the second no");
	 b = Integer.parseInt(din.readLine());
	 System.out.println("sum of " + a + " and " + b  +" is " + (a+b));
	}
	catch(Exception e)
	{
	 System.out.println("Error : " + e);
	}
  }
}