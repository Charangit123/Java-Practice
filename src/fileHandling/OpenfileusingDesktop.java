package fileHandling;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenfileusingDesktop {

	public static void main(String[] args) {

		String path ="C:\\Users\\user1\\Desktop\\experiments\\newt.txt";
		File file = new File(path);
		
		if(!Desktop.isDesktopSupported()) {
			System.out.println("Desktop not supported");
		}
			Desktop desk=Desktop.getDesktop();
			
			if (file.exists()) {
				
				try {
					desk.open(file);
				}
				
				catch (IOException e) {
					e.printStackTrace();
				}
				
			
			}
		
		

	}

}
