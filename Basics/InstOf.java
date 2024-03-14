class Int {
	int a;
}

class Flo {
	float a;
}

class InstOf {
	public static void main(String args[]) {
		Object o;
		Int I = new Int();
		Flo F = new Flo();
		I.a = 10;
		F.a = 20F;
		o = F;
		if(o instanceof Flo) {
			Flo ff = (Flo)o;
			System.out.println(ff.a);
		}
		o = I;
		if(o instanceof Int)  {
			Int ii = (Int)o;
			System.out.println(ii.a);
		}
	}
}