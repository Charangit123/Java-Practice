package oopsConcepts1;

public class WrapperClasses {

	public static void main(String[] args) {
	
	//string to integer
	String s = "100";
	System.out.println(	Integer.parseInt(s));
	String y="123a";
//	System.out.println(Integer.parseInt(y)); //NumberFormatException
	
	
	//string to double
	String d ="89.67";
	System.out.println(d);
	System.out.println(Double.parseDouble(d));
	System.out.println(d+45);
	
	// string to boolean
	String r="true";
	System.out.println(Boolean.parseBoolean(r));
	
	//int to string
	int a= 34;
	System.out.println(String.valueOf(a)+56);
	
	//boolean to string
	boolean b= true;
	System.out.println(String.valueOf(b));
	
		
	
	}
	
	

}
