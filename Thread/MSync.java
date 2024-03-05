import java.io.*;
//sync threads
class CallMe
{
	public void call(String str)
	{
		System.out.println("[" + str);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("]");
	}
}

class TCall implements Runnable
{
	String str;
	CallMe c;
	Thread t;
	public 	TCall(String s,CallMe cc)
	{
		str = s;
		c = cc;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		c.call(str);
	}
}

class MSync
{
	public static void main(String args[])
	{
		CallMe c = new CallMe();
		TCall p,q,r;
		p = new TCall("Hello",c);
		q = new TCall("World",c);
		r = new TCall("Good Day",c);
		try
		{
			p.t.join();
			q.t.join();
			r.t.join();
		}
		catch(InterruptedException e)
		{
		}
	}
}
