import java.net.*;
import java.io.*;

class CDownLoad
{
   public static void main(String[] args)  throws Exception 
   {
 	URL url = new URL("http://beej.us/guide/bgnet/pdf/bgnet_USLetter_2.pdf");
     	URLConnection con;
	InputStream in;
	int len;
	int ch;
	try
	{
		con = url.openConnection();
		in = new DataInputStream(con.getInputStream());
		len = con.getContentLength();
		int pval,pdata,cnt=0;
		pval=0;
		pdata = len/10;
		//len = in.available();
		System.out.println("Size : " + len);
		FileOutputStream fout = new FileOutputStream("test.pdf");
		ch = in.read();
		while(ch != -1)
		{
			cnt++;
			if(cnt > pdata)
			{
				pval += 10;
				System.out.println(pval + "% Completed...");
				pdata += len/10;	
			}
			fout.write((char)ch);
			ch = in.read();
		}
		fout.close();
		
	}
	catch(Exception e)
	{
	}	
  
   }
}