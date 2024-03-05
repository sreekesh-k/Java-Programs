//thorws from main, not used catch
import java.util.*;
import java.io.*;
class CArrayM {
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
		for(i = 0;i < n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
class MThrowsArrayM  {
	public static void main(String args[]) throws IOException,NumberFormatException,ArrayIndexOutOfBoundsException {
	  
		CArrayM obj = new CArrayM();
		obj.readArray();
		obj.dispArray();
	  
	}
}