package hashMapParactice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Basics {

	public static void main(String[] args) {
	
		//no order - no indexing 
		//stores values - key-- value <k,v>
		//key can't be duplicate
		//can store n number of null values ....only gives latest null key value
		//hashmap is not thresd safe (unsynchronised
	HashMap<String, String> capitals = new HashMap<String,String>();
	
	//put method is used for index type storages
	capitals.put("Uk", "London");
	capitals.put("Ethopia", "Adisababa");
	capitals.put("India", "newDelhi");
	capitals.put("hawai", null);
	capitals.put(null, null);
	capitals.put("Argentina", null);
	capitals.put(null, "tashkent");
	
	System.out.println(capitals.get(null));
	capitals.remove(null);
	
	System.out.println(capitals.get("India"));
	System.out.println(capitals.get("hawai"));
	
	
	System.out.println(capitals.containsKey("Uk"));
	System.out.println(capitals.get(null));
	
	//iterator : over the keys by using keyset()
	Iterator<String> it =capitals.keySet().iterator();
	while (it.hasNext()) {
		String key = it.next();
		String value = capitals.get(key);
		System.out.println("index values : "+key + "--value in key: "+value);
}
	
	System.out.println("--------------------------");
	//iterator using set(pair) // using entrySet	
		Iterator<Entry<String,String>> it2 =capitals.entrySet().iterator();
		
		while(it2.hasNext()){
			Entry<String, String> key1 = it2.next();
			System.out.println("index values: "+ key1.getKey()+"--values in key::" +key1.getValue());
			System.out.println(key1);
			System.out.println("----");
		}
		
		System.out.println("--------------------------");
		//iterator using java 8 and foreach
		capitals.forEach((k,v)->System.out.println("index::"+k+"  value in index::"+v));
	
	
	}

}
