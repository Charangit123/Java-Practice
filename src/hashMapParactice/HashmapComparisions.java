package hashMapParactice;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class HashmapComparisions {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "A");
		map2.put(3, "C");
		map2.put(2, "B");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");

		// 1.on the basis of key use EQUALS method
		System.out.println(map1.get(1));
		System.out.println(map1.keySet().equals(map3.keySet())); // true
		System.out.println(map1.keySet().equals(map2.keySet())); // true

		// 2.on basis of complete array
		System.out.println(map1.equals(map2)); // true
		System.out.println(map2.equals(map3)); // false

		// 3.find out extra keys

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");

		HashSet<Integer> combinekey = new HashSet<>(map1.keySet());
		// add keyset from map4
		combinekey.addAll(map4.keySet());
		System.out.println(combinekey);
		combinekey.removeAll(map1.keySet());
		System.out.println(combinekey);

		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");

		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(1, "A");
		map6.put(3, "C");
		map6.put(2, "B");

		HashMap<Integer, String> map7 = new HashMap<Integer, String>();	
		map7.put(1, "A");
		map7.put(2, "B"); 
		map7.put(3, "C");
		map7.put(4, "C");
// Compare values of maps-- using arraylist -- duplicates are are present
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
		//compare values using hashset- duplicate are not present
		
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));
		
	}

}
