package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadfileusingInputStream {
	
	public static void main(String[] args) {
		String path ="C:\\Users\\user1\\Desktop\\experiments\\newt.txt";
		FileInputStream fip=null;
		try {
			File file = new File(path);
			 fip = new FileInputStream(file);
			System.out.println("File content : ");
			
		int i=0;
		while((i=fip.read())!=-1) {
			System.out.print((char)i);
			
		}
		} catch (Exception e) {
			
		}
		finally {
			try {
				fip.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
