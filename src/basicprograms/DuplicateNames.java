package basicprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateNames {

	public static void main(String[] args) {

		String array[] = { "Insta", "Netflix", "Snapshot", "Insta", "Amazon", "Walmart", "Facebook", "Walmart", "Insta",
				"Facebook" };

		// 1.Brute force //for loop
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					System.out.println(array[i]);
				}
			}
		}

		System.out.println("*************************");
		// 2. HashSet
		Set<String> data = new HashSet<>();
		for (String e : array) {
			if (data.add(e) == false) {
				System.out.println(e);
			}
		}

		System.out.println("*************************");
		// HashMap
		Map<String, Integer> map1 = new HashMap<>();
		for (String e : array) {
			Integer count = map1.get(e);
			if (count == null) {
				map1.put(e, 1);
				// System.out.println(map1.get(e));
			} else {
				map1.put(e, ++count);
				// System.out.println(map1.get(e)+" "+e);
			}
		}
		Set<Entry<String, Integer>> entrySet = map1.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey() + "--" + e.getValue());
			}
		}

		
		System.out.println("*************************");
//Streams set and Filter
		Set<String> dataset = new HashSet<>();
		System.out.println(Arrays.asList(array)
				.stream()
				.filter(e -> !dataset.add(e))
				.collect(Collectors.toSet()));
		
		
		System.out.println("*************************");
	//Streams grouping
		Set<String> duplielements=Arrays.asList(array).stream()
		.collect(Collectors
		.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
		.filter(e->e.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toSet());
		System.out.println(duplielements);
	
	
		System.out.println("*************************");
		//Streams using frequency
		List<String> list=Arrays.asList(array);
		Set<String> elemt=list.stream()
				.filter(e->Collections.frequency(list, e)>1)
				.collect(Collectors.toSet());
		System.out.println(elemt);
	}

}
