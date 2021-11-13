package javaCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("Google", 80000);
		map1.put("Facebook", 40000);
		map1.put("Walmart", 3000);
		map1.put("Gmail", 90000);
		map1.put("Gmail", 50000);
		
		
		System.out.println(map1);
		//using lamba function
		map1.forEach((k, v) -> System.out.println("Key:" + k + " Value:" + v));

		System.out.println("-------------");
		//using iterator entryset
		System.out.println("hashmapiterator");
		Iterator it=map1.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
//			Map.Entry twovalues = (Map.Entry)it.next();
//			System.out.println("key " +twovalues.getKey()+ " values "+twovalues.getValue());
		}
		
		//using foreach loop
		System.out.println("-------------");
		List<String> arr1 = new ArrayList<String>(map1.keySet());
		for (String key : arr1) {
			System.out.println(key);
		}
	
		//using foreachloop
		System.out.println("-------------");
		List<Integer> arr2 = new ArrayList<Integer>(map1.values());
		for (Integer value : arr2) {
			System.out.println(value);
		}
		}

	}


