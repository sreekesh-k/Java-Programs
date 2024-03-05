//use of throws
import java.util.*;
import java.io.*;
class CArray {
	int a[],n;
	public void readArray() throws IOException,NumberFormatException,ArrayIndexOutOfBoundsException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		n = s.nextInt();
		a = new int[n];
		for(int i =0;i < n;i++)	{
		   System.out.println("Enter a[" + i + "]");
		   a[i] = s.nextInt();
	   	}
	}
	public void dispArray() throws ArrayIndexOutOfBoundsException {
		int i;
		for(i = 0;i <= n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
class MThrowsArray  {
	public static void main(String args[]) {
	  try{
		CArray obj = new CArray();
		obj.readArray();
		obj.dispArray();
	  }
	  catch(IOException e1)  {
		System.out.println(e1);
	  }
	  catch(NumberFormatException e2)  {
		System.out.println(e2);
	  }
	  catch(ArrayIndexOutOfBoundsException e3)  {
		System.out.println(e3);
	  }
	  catch(Exception e4)  {
		System.out.println(e4);
	  }
	}
}