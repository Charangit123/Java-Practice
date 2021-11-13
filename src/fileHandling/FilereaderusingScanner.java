package fileHandling;

import java.io.File;
import java.util.Scanner;

public class FilereaderusingScanner {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\user1\\Desktop\\experiments\\newt.txt";
		Scanner sc= null;
		try {
		File file = new File(path);
			sc = new Scanner(file);
		
		System.out.println("File contents of Scanner");
		int i=0;
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

	} catch (Exception e) {
		e.printStackTrace();
	}	
	finally {
		sc.close();
	}
	}

}
