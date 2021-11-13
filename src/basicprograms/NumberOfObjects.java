package basicprograms;

public class NumberOfObjects {

	public static void main(String[] args) {
		
		String s1="Hello World";
		String s2="Hello World";
		String s3=s1;
		
		String n1= new String("Hello World");
		String n2= new String("Hello World");
		
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		
		System.out.println(n1==s2);
		System.out.println(n1==n2);
		
		//here n1 value is stored in separate heap memory 
		//n2 is also stored in separate heap memory
//		s1,s2,s3 are created in stack memory but its value
//		is stored heap memory and all the values are referenced to "Hello World"
	}

}
