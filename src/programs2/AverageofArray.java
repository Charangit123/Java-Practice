package programs2;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;

public class AverageofArray {
	public static void main(String[] args) {
		
		int sum=0;
		int p1[]= {1,2,3,4,5,4,5,6,7,6,7,8,9};
		for(int e: p1) {
			sum=e+sum;
		}
		int avg=sum/p1.length;
		System.out.println(avg);
		
		
		//Java streams
		OptionalDouble av1=Arrays.stream(p1).average();
		System.out.println(av1);
		System.out.println(av1.getAsDouble());
		
		//Google Guava
		double avgval =DoubleMath.mean(p1);
		System.out.println(avgval);
		
	}

}
