//loop in java
import java.io.*;
class Cloop
{
  public static void main(String args[])
  {
	DataInputStream din;
	int n,i;
	din = new DataInputStream(System.in);
	try
	{
	 System.out.println("Enter n");
	 n = Integer.parseInt(din.readLine());
	 i=1;
	 while(i <= n)
	 {
 		System.out.println(i);
		i++;
	 }
	}
	catch(Exception e)
	{
	 System.out.println("Error : " + e);
	}
  }
}