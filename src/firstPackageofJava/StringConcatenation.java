package firstPackageofJava;

public class StringConcatenation {

	public static void main(String[] args) {

		int x = 4;
		int y = 6;

		String t = "Hello";
		String u = "World";
//System.out.println(); prints the value in a new line 
//		System.out.print(); prints in same line of before value
		
		System.out.println(x+y);
		System.out.println(t+u);
		System.out.println(x+y+t);
		System.out.println(x+y+t+u);
		System.out.println(t+x+u+y);
		System.out.println(t+u+x+y);
		System.out.println(t+y+x+u);
		System.out.println(t+(x+y)+u);
		System.out.println("the value of string");
		System.out.println("value of x+y:" +x+y);
		System.out.println("the value of x+y:"+(x+y));
		System.out.println("add all--"+x+y+t+u);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
