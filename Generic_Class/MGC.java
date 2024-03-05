//generic class
class Test <T> {
    T a;
    public Test(T aa) {
        a = aa;
    }
    public void disp() {
        System.out.println(a);
    }
}
public class MGC
{
	public static void main(String[] args) {
		 Test <Integer> t1 = new Test(10);
		 Test <String> t2 = new Test("Hello");
		 t1.disp();
		 t2.disp();
	}
}
