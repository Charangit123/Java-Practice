package oopsConcepts1;

public class Static_NonStaticConcepts {

	//scope of static variables is applicable across all the methods/functions
	
	static int y=3; 		//static variable
	String name="Charan";	// non static variable
	
	public static void main(String[] args) {
	
		name();//1. staic methods can be be directly called
		Static_NonStaticConcepts.name();//2. also can be called by classname
		 
		Static_NonStaticConcepts obj = new Static_NonStaticConcepts();
		obj.cla();							// non static method
		System.out.println(obj.name);		// non static variable
	
		//one can access static methods using obj reference also but but is nort standard process
		System.out.println(obj.y); //The static field Static_NonStaticConcepts.y should be accessed in a static way
	}

	public static void name() {
			System.out.println("Print the static method");
	
	}
	
	public void cla() {
		System.out.println("print non static method");
		System.out.println(y);
	}
	
}
