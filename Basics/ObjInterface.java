
//allocating memory of object of class that implements interface
import java.io.*;

interface i1 {
	public void disp();

	public void print();
}

class c1 implements i1 {
	public void disp() {
		System.out.println("interface disp");
	}

	public void print() {
		System.out.println("interface print");
	}

	public void draw() {
		System.out.println("Draw not in interface");
	}
}

class ObjInterface {
	public static void main(String args[]) {
		i1 obj; // interface reference object
		obj = new c1(); // pointing to implemented class
		obj.disp(); // can invoke only methods in the interface
		obj.print();
		// obj.draw(); //directly not possible
	}
}