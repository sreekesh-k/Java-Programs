//use of finally block
import java.io.*;
class FinalyDemo  {
  public static void main(String args[]) {
	int a,b,c;
	DataInputStream din = new DataInputStream(System.in);
	String s;
	try {
		System.out.println("Enter the first no");
		s = din.readLine();
		a = Integer.parseInt(s);
		System.out.println("Enter the second no");
		s = din.readLine();
		b = Integer.parseInt(s);
		c = a / b;
		System.out.println("c = " + c);
		//System.exit(0);  // return;
	}
	catch(Exception e4) {
		System.out.println("Unknown Error " + e4);
	}
	finally  {
		System.out.println("I am always here");
	}
	System.out.println("This is also done..");
  }
}