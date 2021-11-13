package final_finally_finalize_difference;

public class Finally_ {
//finally is a block
	public static void main(String[] args) {
		test2();
		nullpointerexcep();
		
	}
public static void test1() {
	
	System.out.println("IN test1 ");
try {
	
	System.out.println("in try test1");
	int div = 1/0;
	System.out.println("After expection in try");
} catch (ArithmeticException e) {
	System.out.println("in catch block test1");
}

finally {
	System.out.println("in finally block");
	
}
}

public static void test2() {
		System.out.println("IN test2 ");
try {
	
	System.out.println("in try test2");
	throw new RuntimeException("testing");
	//System.out.println("After expection in try");
} catch (Exception e) {
	System.out.println("in catch block test2");
}

finally {
	System.out.println("in finally block in test2");
	
}
} 

public static void nullpointerexcep() {
	System.out.println("##########################");
	
	System.out.println("IN nullpointerexcep() ");
try {

System.out.println("in try nullpointerexcep()");
throw new RuntimeException("testing");
//System.out.println("After expection in try");
} catch (NullPointerException e) {
System.out.println("in catch block nullpointerexcep()");
}

finally {
System.out.println("in finally block in nullpointerexcep()");

}

}

}
