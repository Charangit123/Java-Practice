package basicprograms;

public class DivededByzero {

	public static void main(String[] args) {
		
//		System.out.println(0/0); //arthematic exception
		System.out.println(12.0/0); //Infinity
		System.out.println(143.44566f/0);//Infinity
		System.out.println(18/0.0);//Infinity
		System.out.println(0.0/0.0);//NaN
		System.out.println(0.0/0);//NaN
		System.out.println(0/0.0);//NaN
		System.out.println(123.456d/0); //Infinity
	}

}
