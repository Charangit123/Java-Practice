package exceptionhadling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		
		int i = 0;
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.transfer();
		
		System.out.println("EXception handled and after ");
	}

	public void transfer(){
		
		try {
			div();
		} catch (Throwable e) {
			System.out.println("handling exception");
		}
		
	}
	
	
	public void div() throws ArithmeticException {
		System.out.println("heeyy");
		int y= 34/0;
		System.out.println("after thows");
		
	}
}

// object is the superclass of all exceptions . object os super class to throwable also 
// THROWABLE is the super class of ERROR and EXCEPTION.
//EXCEPTION is parent class class of all the exception . eg : arithmeticeceptions....etc
// all the throws exception is handled by TRY an CATCH block only
// if we don't define try catch blocks we assign the throws exception to main method, JVM handles the exception in this case.