package javaCollections;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.management.ImmutableDescriptor;

public class HashMapInitialisation {

	public static Map<String, Integer> map3 = new HashMap<>();
	static {
		map3.put("A", 200);
		map3.put("B", 100);
	}
	public static void main(String[] args) {
		
		//1. using Hashmap class
		HashMap<String,String> map1 =new HashMap<String, String>();
		Map<String, String> map2= new HashMap<>();
		
		//2. static hash map
		System.out.println(HashMapInitialisation.map3.get("A"));
		
		//3.Immutablemap with only one single entry
		Map<String, Integer> map4=Collections.singletonMap("test",100);
		System.out.println(map4.get("test"));
		//map4.put("text1", 300); //UnsupportedOperationException
		
		//4.JDK 8
		//Creating one 2D array of strings using Stream and collecting in the form Map
		Map<String,String> map5 = Stream.of(new String[][]{
			{"Tom","Jerry"},
			{"Romeo","Juliate"},
			}).collect(Collectors.toMap(value->value[0], value-> value[1]));
			System.out.println(map5.get("Tom"));
			map5.put("For", "Lopp");
			System.out.println(map5.get("For"));
		
		//5.using SimpleEntry: mutable map
			Map<Object, Object> map6= Stream.of(
						new AbstractMap.SimpleEntry<>("Charan","OUCE"),
						new AbstractMap.SimpleEntry("Ram","JNTU")
						).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
					System.out.println(map6.get("Ram"));
					map6.put("nitin","good");
					System.out.println(map6.get("nitin"));
	
		//6.Using SimpleEntry Immutable
					Map<String,String> map7 = Stream.of(
							new AbstractMap.SimpleImmutableEntry<>("text1", "Value1"),
							new AbstractMap.SimpleImmutableEntry<>("text2","Value2")
							).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
					System.out.println(map7.get("text1"));
					map7.put("text3", "value3");
					System.out.println(map7.get("text3"));

		//7.JDK 1.9
		//empty map
					Map<String, String> emptyMap= Map.of();
					//emptyMap.put("trail", "value5"); // UnsupportedOperationException
					//System.out.println(emptyMap.get("trail"));
		//8. SingletonMap
					Map<String,String> singletonmapMap = Map.of("k1","v1");
					System.out.println(singletonmapMap.get("k1"));
//					singletonmapMap.put("k2", "v2"); //UnsupportedOperationException
					
					
		//9.multivalueMap // maximum 10 pairs can be stored
					Map<String, String> multimap= Map.of("k1","v1","k2","v2","k3","v3");
					System.out.println(multimap.get("k2"));
//					multimap.put("k4", "v5");//UnsupportedOperationException
		
		//10.ofEntries method: no limitations on pairs (key-value)
					//Immutable Maps;
					Map<String,String> map8= Map.ofEntries(
							new AbstractMap.SimpleEntry<>("A", "1"),
							new AbstractMap.SimpleEntry<>("C", "3"),
							new AbstractMap.SimpleEntry<>("B", "2")
							) ;
					System.out.println(map8.get("A"));
//					map8.put("D", "4");//UnsupportedOperationException
					
		//11.Guava ImmutableMap
					//add dependencies of Guava to pom file	
//					Map<String,String> map9 = ImmutableMap.of("test1","valu1","test2","value2","test3","value3");
//					System.out.println(map9.get("test1"));
//					map9.put("key4","value");//UnsupportedOperationException
		}
	}


