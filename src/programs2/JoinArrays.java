package programs2;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class JoinArrays {

	public static void main(String[] args) {

		String batsmen[] = { "Virat", "Dhawan", "Rohit", "Dhoni", "Shreyas", "Shubman" };
		String bowlers[] = { "Bhuvi", "Jaddu", "Bhumra", "Ishnat", "Chalal", "Hardik" };

		// Streams
		Stream<String> sBat = Arrays.stream(batsmen);
		Stream<String> sBowl = Arrays.stream(bowlers);
		// System.out.println(sBat);
		String team[] = Stream.concat(sBat, sBowl).toArray(size -> new String[size]);
		// System.out.println(val);
		for (String e : team) {
			System.out.println(e);
		}
		
		System.out.println("--------------------");
		//Google Guava
		String teamall[]= ObjectArrays.concat(batsmen,bowlers, String.class);
	for(String e : teamall) {
		System.out.println(e);
	}
	
	System.out.println("-------------------");
//primitive type arrays
	int p1[]= {1,2,3,4,5,6,7,8};
	int p2[]= {9,10,11,2,2,3,4,5};
	
	int p3[]=Ints.concat(p1,p2);
	for(int e : p3) {
		System.out.println(e);
	}
	}

}
