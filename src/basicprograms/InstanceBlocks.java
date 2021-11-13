package basicprograms;

public class InstanceBlocks {

	//instance blocks will be called only if constructor is called 
	//instance block has priority than constructor 
	static {
		System.out.println("static block");
	}
	
	InstanceBlocks(){
		System.out.println("Constructor class");
	}
	
	{
	System.out.println("It is a instance block");
	}
	
	public static void main(String[] args) {
		System.out.println("In main method");
		new InstanceBlocks();
		
	}

}
