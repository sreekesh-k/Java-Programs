import java.io.*;

class CPerson implements Cloneable {
	int age;
	String name;

	public CPerson() {
		age = 0;
		name = "";
	}

	public CPerson(int a, String n) {
		age = a;
		name = n;
	}

	public void disp() {
		System.out.println("Name " + name + "Age : " + age);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class PersonCln {
	public static void main(String args[]) {
		try {
			CPerson obj = new CPerson(25, "Sss");
			CPerson c = (CPerson) obj.clone();
			c.disp();
		} catch (Exception e) {
		}
	}
}