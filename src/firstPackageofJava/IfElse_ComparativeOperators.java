package firstPackageofJava;

public class IfElse_ComparativeOperators {

	public static void main(String[] args) {

		int i = 4;
		int j = 9;
		if (i > j) {
			System.out.println("i is greater than j");
		} else {
			System.out.println("j is greater than i");
		}
		// types of comparative operators < > == <= >= !=

		int x=8;
		int y=8;
		if(x==y) {
			System.out.println("x is equal to y");
		}else {
			System.out.println("x is not equal to y");
		}
		//highest number logic nested_if
		
	int a=100;
	int b=400;
	int c=500;
	if(a>b & a>c) {
		System.out.println("a is greatest");
	}else if (b>c) {
		System.out.println("b is greaterthan c");
		
	}else {
		System.out.println("c is greater than a and b");
	}
	}
	
	}

