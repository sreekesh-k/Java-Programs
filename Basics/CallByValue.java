class CallByValue {
	public static void swap(int a,int b) {
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a = " + a + " b = " + b);
	}
	public static void main(String args[]) {
		int a = 10,b = 5;
		swap(a,b);
		System.out.println("a = " + a + " b = " + b);
	}
}

	