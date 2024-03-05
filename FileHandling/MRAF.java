import java.io.*;

class CRAF
{
	public void readFile(String fn) throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile(fn, "r");
		raf.seek(5);
		byte[] bytes = new byte[5];
		raf.read(bytes);
		raf.close();
		System.out.println(new String(bytes));
	}
	public void writeFile(String fn,String data) throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile(fn, "rw");
		raf.seek(5);
		raf.write(data.getBytes());
		raf.close();
	}
	public void appendFile(String fn,String data)throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("file.txt", "rw");
		raf.seek(raf.length());
		raf.write(data.getBytes());
		raf.close();
	}
}

class MRAF
{
	public static void main(String args[]) throws IOException
	{
		CRAF obj = new CRAF();
		//obj.readFile(args[0]);
		//obj.writeFile("file.txt","JAVA");
		obj.appendFile("file.txt","THINKING IN JAVA");
	}
}