package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Createnewfile {

	public static void main(String[] args) {
	
		//using direct creation of location
//		File file = new File("C:\\Users\\user1\\Desktop\\experiments\\newtext.txt");
//		try {
//			boolean val=file.createNewFile();
//			if(val) {
//			System.out.println("File has created");
//			}else {
//				System.out.println("File already present");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();	
//		}
//		
//		
//		//Create file by user given location and enter Test using SCANNER
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter file path");
//		String filename =sc.nextLine();
//		
//		try {
//			FileOutputStream fos= new FileOutputStream(filename);
//			System.out.println("Enetr the file content");
//			String content=sc.nextLine();
//			byte[] b= content.getBytes();
//			fos.write(b);
//			fos.close();	
//			System.out.println("File craetion is comlete");
//		} catch (Throwable e) {
//			e.printStackTrace();
//			System.out.println("Exception in file creation");
//		}
//		
		
		//using Java nio package
		Path pathlocation=Paths.get("C:\\Users\\user1\\Desktop\\experiments\\usinjavanio.txt");
		try {
			System.out.println("here is the path : "+Files.createFile(pathlocation));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
