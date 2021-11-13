package basicprograms;

public class VariablesinStatic {
	// can we initialise member variables in static ?
	
	static int i=89;
	String name;
	static{
		VariablesinStatic obj = new VariablesinStatic();
		obj.name="Charmy";
		
		System.out.println(obj.name +"  "+i);
	}
	public static void main(String[] args) {
	
		
		System.out.println("in main method");

	}

}
