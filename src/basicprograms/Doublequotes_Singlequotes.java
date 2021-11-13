package basicprograms;

public class Doublequotes_Singlequotes {

	public static void main(String[] args) {
		//for every " use a backward slash \
		System.out.println("Hello");
		System.out.println("\"Hello\"");
		System.out.println("'Hello'");
		System.out.println("/Hello/");
		System.out.println("'/Hello/'");
		System.out.println("/'Hello'/");
		System.out.println("I love \"java\" programmimg and \"movies\"");
		System.out.println("'I love \"java\" programmimg and \"movies\"'");
		
		System.out.println("\\Hello\\");
		System.out.println("\\\\Hello");
		System.out.println("\\\\Hello\\\\");
		System.out.println(getXpath("Saicharan"));
		System.out.println(getXpath(",,';;'[]][][-="));
		System.out.println(getXpath("456788"));
		System.out.println(getXpath("testing"));
	
	}

	
	public static String getXpath(String name) {
		String Xpath="//input[@id='"+name+"']";
		return Xpath;
	}
}
