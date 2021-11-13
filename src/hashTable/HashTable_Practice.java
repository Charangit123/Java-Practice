package hashTable;

import java.util.Hashtable;

import oopsConcepts2.HashTable;

public class HashTable_Practice {
//hashtable is Synchronized whereas hashmap is not
	public static void main(String[] args) {
		
		Hashtable<Integer,String> arr = new Hashtable<>();
		arr.put(1,"Ram");
		arr.put(4, "icet");
		arr.put(3,"emcet");
		arr.put(6,"youtube");
		arr.put(1627,"sample");
		arr.put(422526627, "jsksksl");
//		arr.put(null, null)// hashtable doesn't store null values and null key
	System.out.println(arr);
	
	Hashtable<String,Integer> arr1 = new Hashtable<>();
	arr1.put("Ram",1);
	arr1.put( "icet",4);
	arr1.put("emcet",9);
	arr1.put("youtube",89);
	arr1.put("sample",0);
System.out.println(arr1);
	
	}

}
