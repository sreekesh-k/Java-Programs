//write data into a file usinf FileWriter
import java.io.*;
import java.util.*;
class FWriter {
   public static void main(String args[]) {
	BufferedWriter bw;
	FileWriter fw;
	try {
		fw = new FileWriter(new File("s.txt"));
		bw = new BufferedWriter(fw);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data / quit to terminate");
		String data = s.nextLine();
		while(!data.equals("quit")) {
			bw.write(data + "\n");
			data = s.nextLine();
		}
		bw.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
   }
}