package fileHandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;



public class ReadfileusingNIO {

	public static void main(String[] args) {
		String path = "C:\\Users\\user1\\Desktop\\experiments\\newt.txt";
		try {
			List<String> li= Files.readAllLines(Paths.get(path),StandardCharsets.UTF_8);
			Iterator<String> it = li.iterator();
			System.out.println("Content using NIO java iterable");
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
