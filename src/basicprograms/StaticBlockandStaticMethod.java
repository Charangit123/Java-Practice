package basicprograms;

public class StaticBlockandStaticMethod {

	//static block and static methods can be created without creating any objects.
	//static method is called only if we call it in main method ]
	//static block is called automatically
	
	static {
		System.out.println("staticblock");
	}
	
	static void test() {
		System.out.println("staticmethod");
	}
	public static void main(String[] args) {
	
		System.out.println("main method");
		test();
		StaticBlockandStaticMethod.test();
		//static method can be called without creation of any objects using above two types 
	}

}
