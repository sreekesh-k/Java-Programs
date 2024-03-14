class Int {
	int a;
}
class CallByReference {
	public static void swap(Int p,Int q) {
		int c;
		c = p.a;
		p.a = q.a;
		q.a = c;
		System.out.println("a = " + p.a + " b = " + q.a);
	}
	public static void main(String args[]) {
		Int p,q;
		p = new Int();
		p.a = 10;
		q = new Int();
		q.a = 5;
		swap(p,q);
		System.out.println("a = " + p.a + " b = " + q.a);
	}
}

	