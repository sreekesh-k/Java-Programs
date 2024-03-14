interface IShape {
	void disp();
	void draw();
}

class CLine implements IShape {
	public void disp() {
		System.out.println("In Line disp");
	}
	public void draw() {
		System.out.println("In Line draw");
		print();
	}
	public void print() {
		System.out.println("In Line Print");
	}
}
class CCircle implements IShape {
	public void disp() {
		System.out.println("In Circle disp");
	}
	public void draw() {
		System.out.println("In Circle draw");
		print();
	}
	public void print() {
		System.out.println("In Circle Print");
	}
}

class IntrfaceCLInstns {
	public static void main(String args[]) {
		IShape obj;
		obj = new CLine();
		obj.disp();
		obj.draw();
		obj = new CCircle();
		obj.disp();
		obj.draw();
		if (obj instanceof CCircle) 
			System.out.println("Circle object");
		else if(obj instanceof CLine)
			System.out.println("Line object");
		else
			System.out.println("Some other object");
	}
}