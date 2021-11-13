package basicprograms;

public class StaticWithFinal {

	public static void main(String[] args) {
		System.out.println(example.x);
		System.out.println(example1.x);
		System.out.println(new example().x);
	}
}

//example class
class example{
		public static final int x=30;//compiler optimiszation
		
		static {
			System.out.println("i am in static block");
		}
	}
	
// example1 block
class example1{
	public static int x=40;
	
	static {
		System.out.println("i am in static block example1");
	}
}

