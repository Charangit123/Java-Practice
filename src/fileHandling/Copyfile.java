package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyfile {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\user1\\Charan\\Downloads\\heartmate\\hard copy.docx");
		File  newfile = new File("C:\\Users\\user1\\Charan\\Downloads\\heartmate\\hard copy-copy.docx");
		
		FileInputStream fileinstream= null;
		FileOutputStream fileoustream=null;
		
		try {
			fileinstream=new FileInputStream(file);
			fileoustream = new FileOutputStream(newfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(fileinstream.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int i=0;
		try {
			while((i=fileinstream.read())!=-1) {
				fileoustream.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
