package fileHandling;

import java.io.File;
import java.util.Arrays;

import firstPackageofJava.IfElse_ComparativeOperators;

public class FilePath {

	public static void main(String[] args) {
		File file = new File("E:\\New folder (2) replaced one");
		File listarray[] = file.listFiles();
		
		Arrays.sort(listarray);
		for (File eachfile : listarray) {
			if(eachfile.isFile()) {
				System.out.println("File name : "+eachfile.getName()+""+eachfile.getAbsolutePath());
				
			}else if(eachfile.isDirectory()){
				System.out.println("Folder : "+eachfile.getName()+""+eachfile.getAbsolutePath());
				
			}else {
				System.out.println("unknown file__"+eachfile.getName()+""+eachfile.getAbsolutePath());
			}
		}

	}

}
