//open a folder and display its contents
import java.io.*;
class DispDir {
	public static void main(String args[]) {
		File f;
		String s[];
		int i;
		try {
			f = new File("d:\\");
			s = f.list();
			for(i = 0;i < s.length;i++) {
				System.out.println(s[i]);
			}
		}
		catch(Exception e) {
		}
   	}
}