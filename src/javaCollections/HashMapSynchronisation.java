package javaCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSynchronisation {

	public static void main(String[] args) {
		//SynchronisedMap method in collections class
		Map<String,String> map1= new HashMap<>();
		map1.put("k1","v1");
		map1.put("k2","v2");
		map1.put("k3","v3");
		//creation of synchronizedhashmap
		Map<String,String> map2=Collections.synchronizedMap(map1);
		System.out.println(map2);
		System.out.println(map2.get("k1"));
		
		//ConcurrenthashMap : it does not throw any ConcurrentModificationException 
		ConcurrentHashMap<String,String> map3 = new ConcurrentHashMap<>();
		map3.put("k1", "va");
		map3.put("k2", "v222");
		map3.put("k3", "v3");
		System.out.println(map3.get("k2"));
	}

}
