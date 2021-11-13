package basicprograms;

public class Print_1To_100withoutANYnumber {

	public static void main(String[] args) {
		for(int i='1'; i<=100;i++) {
			System.out.print(" "+i);
		}
		
		int j=1;
		while(j<=100) {
			System.out.print(" "+j);
			j++;
		}
		System.out.println("");
		String i= "Charan";
		System.out.println("length of string::"+i.length());
	
	//without any number
	int one = 'A'/'A';  //1
	String ram = "abcdefghij";
	for(int x=one;x<=(ram.length()*ram.length());x++) {
		System.out.print(x);
	}
	
	//ASCII code a=97, b=98, c=99,d=100;
	for(int q=one;q<='d';q++) {
		System.out.println(q);
		
	}
	
	}
}
