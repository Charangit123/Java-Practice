package firstPackageofJava;

public class Post_Pre_increment {

	public static void main(String[] args) {

//post increment
		int i = 1;
		int j = i++;
		System.out.println(i); //2
		System.out.println(j); //1

		// pre increment
		int a = 1;
		int b = ++a;
		System.out.println(a); //2
		System.out.println(b); //2

		// post decrement
		int x = 1;
		int y = x--;
		System.out.println(x); //0
		System.out.println(y); //1

		// pre decrement
		int k = 1;
		int l = --k;
		System.out.println(k); //0
		System.out.println(l); //0
	}

}
