package oopsConcepts2;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable a = new Hashtable();
		
		a.put("A","pok");
		a.put(0,8);
		a.put("l", "a");
		System.out.println(a.size());
		
	Hashtable<Integer, Integer>	h= new Hashtable<Integer,Integer>();
	h.put(1,1);
	h.put(3, 5);
	System.out.println(h.size());
	
	Hashtable<Integer, String> e= new Hashtable<Integer,String>();
	e.put(4, "hackeer");
	System.out.println(e.get(4));
	System.out.println(a.get("A"));
	}

}
