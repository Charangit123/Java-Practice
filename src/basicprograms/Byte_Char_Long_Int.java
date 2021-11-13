package basicprograms;

public class Byte_Char_Long_Int {

	public static void main(String[] args) {
		int i = (byte)+(char)-(int)+(long)-1;
		//-1 is typecasted to long and -1 is tycasted to int and then char and then into byte
		System.out.println(i);
		
		char j= (char)97;
		char k=(char)1;
		System.out.println(j);
		System.out.println(k);
		
		byte l=(byte)-128; //(limit -128 to 127)
		System.out.println(l);
		
		long n= (long)456789;
		System.out.println(n);
		
	}

}
