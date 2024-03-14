interface I1 {
	void disp();
	void draw();
}

class C1 implements I1 {
	public void disp() {
		System.out.println("In interface disp");
	}
	public void draw() {
		System.out.println("In interface draw");
	}
	public void print() {
		System.out.println("In print not an interface");
	}
}

class Intrface1 {
	public static void main(String args[]) {
		I1 obj = new C1();
		obj.disp();
		obj.draw();
		//obj.print();  // here error
	}
}