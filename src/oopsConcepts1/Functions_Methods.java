package oopsConcepts1;

public class Functions_Methods {

	String name="charan";
	
	
	//main method is starting point of execution. 
	//main method is a void never returns any value
	public static void main(String[] args) {
		
		Functions_Methods ob = new Functions_Methods();
		// one object will be created, ob is th reference variable for the (new Functions_Methods) object
		//once object is create a copy of non static variables and methods are gone to ob
		
		ob.dummy();
		System.out.println(ob.name);
		System.out.println(ob.sum());
		System.out.println(ob.value());
		System.out.println(ob.twopara(3,6));
	}
// non static methods

// void doesnot return any value
// return type -- void

// 1. method with no input no output
	public void dummy() {
		System.out.println("first method no inut no output ");
	}

// 2. no input but output
	public int sum() {
		System.out.println("method with no input but some return type");
		int i = 20;
		int j = 40;
		int x = i + j;
		return x;

	}

//3. no input return type string
	public String value() {
		String s = "sample";
		System.out.println("return string");
		return s;
	}

//4. a,b are input parameters/ arguements
	// return type int
	public int twopara(int a, int b) {
		System.out.println("parameter returns values");
		int z = a + b;
		return z;
	}

}
