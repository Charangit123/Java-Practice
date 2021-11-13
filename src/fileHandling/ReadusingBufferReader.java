package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadusingBufferReader {

	public static void main(String[] args) {
		String path = "C:\\Users\\user1\\Desktop\\experiments\\newt.txt";
		BufferedReader b=null;
		try {
			File file = new File(path);
			 b = new BufferedReader(new FileReader(file));
			System.out.print("the contents using bufferreader");
			int i=0;
			while((i=b.read())!=-1) {
				
				System.out.print((char)i);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				b.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
