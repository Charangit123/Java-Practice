package basicprograms;

public class ConstructorPrivate {

	//How can we create the objects if we make the constructor private?

	static {
		//ConstructorPrivate obj1= new ConstructorPrivate();
		System.out.println("in static block");
	}
	
	public static int test() {
		ConstructorPrivate obj2= new ConstructorPrivate();
		System.out.println("from another method of private calss");
		obj2.age=50;
		return obj2.age;
	}
	
	int age; 
	private ConstructorPrivate() {
		age= 30;
	}
	
	public static void main(String[] args) {
	ConstructorPrivate obj = new ConstructorPrivate();
	System.out.println(obj.age);
	}

}
