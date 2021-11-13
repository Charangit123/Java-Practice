package programs2;

public class Streams8 {

	public static void main(String[] args) {
	String str="Here is a sample program i am writing";
		System.out.println(getcount(str,'a'));
		
		System.out.println(getcount(str,'e','g'));
		
	}

	
	public static long getcount(String str, char c1) {
		
		return str.chars().filter(e-> (char)e==c1).count();
	}
	
public static long getcount(String str, char c1, char c2) {	
		return str.chars().filter(e-> (char)e==c1|| (char)e==c2).count();
	}
}
