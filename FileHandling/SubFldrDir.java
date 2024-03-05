//display subfolders of folder
import java.io.*;
class SubFldrDir {
	public static void main(String args[]) {
		File f;
		String s[];
		int i;
		try {
			f = new File("c:\\");
			s = f.list();
			for(i = 0;i < s.length;i++) {
				File ff = new File("c:\\downloads\\" + s[i]);
				if(ff.isDirectory()) {
					System.out.println("d:\\appdata\\" + s[i]);
				}
			}
		}
		catch(Exception e) {
		}
   	}
}