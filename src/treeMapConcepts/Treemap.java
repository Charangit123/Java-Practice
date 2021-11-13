package treeMapConcepts;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
	
		//Treemap is used to store values in sorting order without repetition(in repetition updated value is stored)
		TreeMap<Integer,String> map1 = new TreeMap<>();
		map1.put(200, "Sai");
		map1.put(1700, "Charan");
		map1.put(1700, "Ram");
		map1.put(40, "I am");
		map1.put(60, "you");
		map1.put(3000, "ramu");
		System.out.println(map1);//gives valus in sorted order
		map1.forEach((k,v)->System.out.println("KEY:"+k +" Value :"+v));
	System.out.println(map1.firstKey());
	System.out.println(map1.lastKey());
	System.out.println(map1.firstEntry());
	System.out.println(map1.lastEntry());
		
		TreeMap<String,Integer> map2 = new TreeMap<>();
		map2.put("Here", 6788);
		map2.put("I am", 678);
		map2.put("Printing", 68);
		map2.put("Some", 688);
		map2.put("Value", 788);
		map2.put("h", null);
		System.out.println(map2);
		
		System.out.println(map2.headMap("Printing"));//gives value lessthan Printing in alphabetic order
		System.out.println(map2.tailMap("I am")); //gives value equal and greater than I am
		System.out.println(map1.tailMap(1700).keySet());//gives values of key greater and eaqul than 1700
	}
	
	
	

}
