import java.io.*;
import java.lang.*;

class Student implements Cloneable {
	int rollno;
	String name;

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Studentcln {
	public static void main(String args[]) {
		try {
			Student s1 = new Student(101, "amit");

			Student s2 = (Student) s1.clone();

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

		} catch (CloneNotSupportedException c) {
		}

	}
}