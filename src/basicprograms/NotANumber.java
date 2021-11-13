package basicprograms;

public class NotANumber {

	public static void main(String[] args) {
		
//		System.out.println(2/0);//Arthematic exception
		System.out.println(2.0/0.0); // Infinity
		System.out.println(0.0/0.0); // NaN
		System.out.println(Math.sqrt(-1)); //NaN
		System.out.println(Float.NaN);
		System.out.println(Float.NaN==Float.NaN);
		System.out.println(Float.NaN!=Float.NaN);
		
		double 	nan =2.1%0;
		System.out.println(nan);//NaN
		System.out.println(nan==nan);
		System.out.println(nan!=nan);
	}

}
