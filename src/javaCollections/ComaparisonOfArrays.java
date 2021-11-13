package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ComaparisonOfArrays {

	public static void main(String[] args) {
	
		//1.Sort and compare
		ArrayList<String> ar1= new ArrayList<>(Arrays.asList("G","F","E","D","C","B","A"));
		ArrayList<String> ar2= new ArrayList<>(Arrays.asList("H","F","E","D","C","B","A"));
		ArrayList<String> ar3= new ArrayList<>(Arrays.asList("F","H","E","D","C","B","A"));
		
		Collections.sort(ar1);
		Collections.sort(ar2);
		Collections.sort(ar3);
		
		System.out.println(ar1.equals(ar2));
		System.out.println(ar2.equals(ar3));
		
		//2.compare and find common elemnts
		ar1.retainAll(ar2);
		System.out.println(ar1);
		
		//3.compare and find additional elemnt
		ArrayList<String> ar4= new ArrayList<>(Arrays.asList("G","F","E","D","C","B","A"));
		ArrayList<String> ar5= new ArrayList<>(Arrays.asList("H","F","E","D","C","B","A"));
		ar4.removeAll(ar5);
		System.out.println(ar4);
		
		//4. compare and find missing element
		ArrayList<String> ar6= new ArrayList<>(Arrays.asList("G","F","E","D","C","B","A"));
		ArrayList<String> ar7= new ArrayList<>(Arrays.asList("H","F","E","D","C","B","A"));
		ar7.removeAll(ar6);
		System.out.println(ar7);
		
		//
		
	}

}
