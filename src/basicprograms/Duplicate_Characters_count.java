package basicprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Duplicate_Characters_count{

	public static void main(String[] args) {
		function(null);
		function("");
		function("L");
		function("Intelligent little lottery");
		System.out.println();
	}
//	String st="saicharandasari";
//		char arr[]=st.toCharArray();
//		System.out.println(Arrays.asList(arr));
//			
//		}

	public static void function(String str) {
		if (str == null) {
			System.out.println("String is null");
			return;
		}
		if (str == "") {
			System.out.println("String is Empty");
			return;
		}
		if (str.length() == 1) {
			System.out.println("Single Character");
			return;
		} else {
			char charlist[] = str.toCharArray();
			Map<Character, Integer> array = new HashMap<>();
			for (Character e : charlist) {
				if (array.containsKey(e)) {
				array.put(e,array.get(e)+1);
				} else {
					array.put(e, 1);
				}
			}
			Set<Map.Entry<Character, Integer>> entry = array.entrySet();
			for (Map.Entry<Character, Integer> e : entry) {
				if (e.getValue() > 1) {
					System.out.print(e.getKey() + "-" + e.getValue()+"; ");
				}

			}
		}

	}

}
