//Exception demo
class CExceptions  {
	public static void main(String args[] )  {
	   try {
		int c;
		c = 5/2;
		try {
			c = 10 / 0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(c);
	   }
    	   finally {
		System.out.println("here");
	   }
	}
}
	