package exceptionhadling;

public class ThrowKeyword  {

	public static void main(String[] args)  {
		
		System.out.println("sample print out");
	
		try {
			throw new Exception("deliberate exception");		
		} catch (Exception e) {
			System.out.println("in catch bvlock");
		}
	
			System.out.println("hi after try catch and handled throw exception");
			
	
	}

}
// THROW exception is used to throw an deliberate exception.
// all the exceptions are handled by try-catch block and throws Exception in main method