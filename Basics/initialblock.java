import java.io.*;
class Test {
    int a;
    /*Test(int aa) {
        a = aa;
    }
    */
    {
        a=10;
    }
    public void disp() {
        System.out.println(a);
    }
}
public class initialblock
{
	public static void main(String[] args) {
		 Test t1,t2;
		 t1 = new Test();
		 t2 = new Test();
		 t1.disp();
		 t2.disp();
	}
}
