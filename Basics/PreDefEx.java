//Predefined Exception
import java.io.*;
class PreDefEx  {
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
	}
	catch(IOException e1) {
		System.out.println("Unable to read from io device " + e1);
	}
 	catch(NumberFormatException e2) {
		System.out.println("Input String not a number " + e2);
	}
	catch(ArithmeticException e3) {
		System.out.println("Dr is zero " + e3);
	}
	catch(Exception e4) {
		System.out.println("Unknown Error " + e4);
	}
  }
}