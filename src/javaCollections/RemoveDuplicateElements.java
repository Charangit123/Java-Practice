package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,89,9));
		
		//1. LinkedHashSet
		
		LinkedHashSet<Integer>  linkhashset= new LinkedHashSet<Integer>(numbers);
		System.out.println(linkhashset);
		ArrayList<Integer> list = new ArrayList<Integer>(linkhashset);
		System.out.println(list);
		
		//JDK - 8 Stream
		ArrayList<Integer> numberlist = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,89,9));
		List<Integer> noduplicate =numberlist.stream().distinct().collect(Collectors.toList());
		System.out.println(noduplicate);
	}

}
