//copy contents of one file to another
import java.io.*;
import java.util.*;
class FCopy {
   public static void main(String args[]) {
	FileInputStream fin;
	FileOutputStream fout;
	Scanner s = new Scanner(System.in);
	String sfname,dfname;
	try {
	  System.out.println("Enter the source file name");
	  sfname = s.nextLine();
	  System.out.println("Enter the destination file name");
	  dfname = s.nextLine();
	  fin = new FileInputStream(sfname);
	  fout = new FileOutputStream(dfname);
	  byte b[];
	  b = new byte[5];
	  int n = fin.read(b,0,5);
	  while(n != -1) {
		fout.write(b,0,n);
		n = fin.read(b,0,5);
 	  }
	  fin.close();
	  fout.close();
     	}
	catch(Exception e) {
		System.out.println("Error " + e);
	}
   }
}