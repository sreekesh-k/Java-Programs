//user defined Exception
import java.util.*;
class MyEx extends Exception {
	String strError;
	public MyEx(String s) {
		super();
		strError = s;
	}
	public void disp()  {
		System.out.println("Error :" + strError);
	}
}
class UserDefinedEx {
   public static void main(String args[]) {
	int a,b,c;
	Scanner s = new Scanner(System.in);
	try {
		System.out.println("Enter two nos");
		a = s.nextInt();
		b = s.nextInt();
		if(b == 0) {
			throw new MyEx("Dr is ZERO Not Possible");
		}
		c = a / b;
		System.out.println("c = " + c);
	}
	catch(MyEx m) {
		m.disp();
	}
	catch(Exception e) {
		System.out.println(e);
	}
  }
}


