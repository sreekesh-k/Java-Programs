import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFE {

	public static void main(String[] args) {
		try {
			
			String filePath = "file.txt"; 
			System.out.println(new String(readCharsFromFile(filePath, 1, 5)));
			writeData(filePath, "Data", 5);			
			appendData(filePath, "appended");
			System.out.println(new String(readCharsFromFile(filePath, 0, -1)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void appendData(String filePath, String data) throws IOException {
		RandomAccessFile raFile = new RandomAccessFile(filePath, "rw");
		raFile.seek(raFile.length());
		System.out.println("current pointer = "+raFile.getFilePointer());
		raFile.write(data.getBytes());
		raFile.close();
		
	}

	private static void writeData(String filePath, String data, int seek) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(seek);
		file.write(data.getBytes());
		file.close();
	}

	private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		if(chars == -1)
			chars = (int)file.length();
		file.seek(seek);
		byte[] bytes = new byte[chars];
		file.read(bytes);
		file.close();
		return bytes;
	}

}