package oopsConcepts1;

public class Method_Overloading {

	// method overloading means using same method with different data types,	 different arguments or input parameters within the same class
	//we can't create a method inside a method.
	//duplicate method-- we can't create a same method with same parameters and arguments 
	
	public static void main(String[] args) {

		Method_Overloading obj = new Method_Overloading();
		obj.sum();
		obj.sum(6);
		obj.sum("ramana");
		obj.sum(34, 35);
	}

	// we can overload a main method also with different arguements
//	public static void main( int x) {
//		
//	}
//	
	public void sum() {
		System.out.println("void method");
	}
	public static void main(char c, char y) {
		
	}
//	
	// method with single parameter
	public void sum(int i) {
		int x = 1;
		System.out.println("Method with single parameter");
		System.out.println(i);
	}

	// Method with two paerametrs
	public void sum(int i, int j) {
		int x = i + j;
		System.out.println("Method with 2 parameters");
		System.out.println(x);
	}

	// method with string parameter
	public void sum(String r) {
		String z = "Sayonara";
		System.out.println("passing string value ");
		System.out.println(r);

	}

}
