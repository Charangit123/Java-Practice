package oopsConcepts1;

public class LocalVariablea_nd_GlobalVariable {

	String name="Charan";		// Global variables or class variables
	int y= 10;
	
	public static void main(String[] args) {
		
	int z= 111; 	// local variables of main method.
	System.out.println(z);
	
	LocalVariablea_nd_GlobalVariable obj= new LocalVariablea_nd_GlobalVariable();
	
	obj.local();
	System.out.println(obj.name);
	}

	
	public void local() {
		int z=23;   //local varibles of local() method
		int y= 24; 	//local varibles of local() method
		int x= 23;	//local varibles of local() method
		System.out.println("this are local variables :" +x+y);
		
	}
}
