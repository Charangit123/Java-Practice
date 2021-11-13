package basicprograms;

public class MinOf_Float_Double {

	public static void main(String[] args) {
		
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println(Math.min(Double.MIN_VALUE,0.0d));
		
		System.out.println(Math.min(Double.NEGATIVE_INFINITY,0.0d));
		System.out.println(Math.min(Double.MIN_VALUE,0.0d));
		
		System.out.println(Math.min(Integer.MIN_VALUE,0));
		
	}

}
