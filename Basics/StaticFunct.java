//static function
class c1
{
	int a;
	public c1()
	{
		a = 10;
	}
	public static void disp()
	{
		c1 obj = new c1();
		System.out.println(obj.a);
	}
}
class StaticFunct
{
	public static void main(String args[])
	{
		c1.disp();
	}
}