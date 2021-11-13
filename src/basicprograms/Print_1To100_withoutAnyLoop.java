package basicprograms;

import java.util.stream.IntStream;

public class Print_1To100_withoutAnyLoop {

	public static void main(String[] args) {

		// 1. recusive method
		// 2.JavaStream
		IntStream.range(30,101).forEach(e-> System.out.print(e+" "));
		
		System.out.println("");
		recursive(1);
		System.out.println("");
		recursive1(1);
		System.out.println("");
		startToendNumb(400, 500);
	}

	// using return type
	public static int recursive1(int x) {

		System.out.print(x+" ");
		if (x <100)
			return recursive1(x + 1);
		else
			return x + 1;
	}

	
	// without using return type
	public static void recursive(int x) {

		System.out.print(x+" ");
		if (x < 100) {
			x++;
			recursive(x);
		}
	}

	// using two parameters in method
	public static void startToendNumb(int startN, int endN) {
		System.out.print(startN +" ");
		if (startN < endN) {
			startN++;
			startToendNumb(startN, endN);
		}
	}

}
