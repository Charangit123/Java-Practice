package firstPackageofJava;

public class Loops {

	public static void main(String[] args) {

//while
//disadv_ it gives infinite loop if increment/decrement is not given

		int i = 1;// initialize
		while (i <= 10) { // condition
			System.out.println(i);
			i = i + 1; // increment/decrement
		}

		//for loop increment
		System.out.println("###########################################");
		for (int j = 1; j <= 10; j++) { // initialization , condition, increment
			System.out.println(j);
		}
		
		//for FOR loop also if increnmet/decrement function is not given the loop runs infinitely
		System.out.println("###########################################");
		for (int k = 15; k >= 1;) {
			System.out.println(k);
		}
	}

}
