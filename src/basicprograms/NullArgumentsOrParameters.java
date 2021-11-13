package basicprograms;

public class NullArgumentsOrParameters {

	public static void main(String [] arg ) {
		test(null);
		
		//String class will be called beacuse String is child of object 
		//StringBuffer and StringBuilder are not related to string 
		
	}

	public static void test(Object o) {
		System.out.println("Object argument");
	}
	public static void test(String s) {
		System.out.println("String argument");
	}
	
//	public static void test(StringBuffer s) {
//		System.out.println("String argument");
//	}

//	public static void test(StringBuilder s) {
//		System.out.println("String argument");
//	}
	
	
//	public static void test( Integer i) {
//		System.out.println("Integer argument");
//	}
}
