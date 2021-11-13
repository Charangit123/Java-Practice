package basicprograms;

public class PrintHelloworld {

//printing hello world without semicolon

	public static void main(String[] args) {

		// 1.using printf
		if (System.out.printf("Hello World" + "\n") == null) {

		}
		// 2.using append
		if (System.out.append("Hello World \n" + "\n") == null) {

		}

//		3.using append
		if (System.out.append("Hello World \n").equals(null)) {
		}
		// 4. using for loop
		for (int i = 0; i < 1; System.out.println("Hello world")) {
			i++;
		}
	}
}
