import java.io.*;

class CNum
{	
	public int a;
}

class CSwap
{
	public void swap(int a,int b)
	{
		int t;
		System.out.println("a = " + a + " b = " + b);
		t = a;
		a = b;
		b = t;
		System.out.println("a = " + a + " b = " + b);
	}
	public void swap(String a,String b)
	{
		String  t;
		System.out.println("a = " + a + " b = " + b);
		t = a;
		a = b;
		b = t;
		System.out.println("a = " + a + " b = " + b);
	}
	public void swap(CNum p,CNum q)
	{
		int a;
		a = p.a;
		p.a = q.a;
		q.a = a;
	}

}

class OverloadSwap
{
	public static void main(String args[])
	{
		CSwap obj = new CSwap();
		int p=10,q=20;
		String s1="hello",s2 = "World";
		obj.swap(p,q);
		System.out.println("p = " + p + " q = " + q);
		obj.swap(s1,s2);
		System.out.println("s1 = " + s1 + " s2 = " + s2);
	
		CNum obj1 = new CNum();
		CNum obj2 = new CNum();
		obj1.a = 23;
		obj2.a = 33;
		System.out.println("obj1.a = " + obj1.a + " obj2.a = " + obj2.a);
		obj.swap(obj1,obj2);
		System.out.println("obj1.a = " + obj1.a + " obj2.a = " + obj2.a);
		
	}
}