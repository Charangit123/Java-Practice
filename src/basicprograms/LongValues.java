package basicprograms;

public class LongValues {

	public static void main(String[] args) {
		
		long withoutL = 345*1000*67*456;
		System.out.println(withoutL); //10540440000 actual value--it is a 39 bit value
		//1110010000010110100110001000110111000000
		
		//but given value is 379096512
		//Java gives max limit of 32 bit after 32 bit first binary values are truncated
		
		long withL = 345*1000*67*456L;
		System.out.println(withL);//10540440000
	}

}
