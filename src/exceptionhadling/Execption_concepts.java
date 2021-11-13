package exceptionhadling;

public class Execption_concepts {

	public static void main(String[] args) {
		
	//	Execption_concepts obj = null;
		//System.out.println(obj);
		
//		uncaught exceptions
		//int i = 9/0;
		//System.out.println(i);
//  	caught exceptions
		 //Thread.sleep(3000);
		
// 1, try and catch
		
	try {
		int y=10/0;
	} catch (ArithmeticException e) {
		e.printStackTrace();
	System.out.println(e.getMessage());
		System.out.println("hi");
	}
		System.out.println("i am after the try catch expection blocks");
		
	}

}
