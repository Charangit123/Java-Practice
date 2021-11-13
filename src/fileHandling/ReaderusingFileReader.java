package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderusingFileReader {

	public static void main(String[] args) {
		String path = "C:\\Users\\user1\\Desktop\\experiments\\newt.txt";
		FileReader fr =null;
		try {
			 fr = new FileReader(path);
			System.out.println("Contents using FileReader");
			int i=0;
			while((i=fr.read())!=-1) {
		System.out.print((char)i);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
