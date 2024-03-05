//read contents of a file using FileReader
import java.io.*;
class FReader {
   public static void main(String args[]) {
	BufferedReader br;
	FileReader fr;
	try {
		fr = new FileReader(new File("a.txt"));
		br = new BufferedReader(fr);
		String data = br.readLine();
		while(data != null) {
			System.out.println(data);
			data = br.readLine();
		}
		br.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
   }
}
