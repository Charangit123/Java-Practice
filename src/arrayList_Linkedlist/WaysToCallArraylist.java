package arrayList_Linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WaysToCallArraylist {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Ramu");
		ar.add("Charan");
		ar.add("manasa");
		ar.add("vajpayee");
		
//		System.out.println(ar[-1]); // ArrayIndexOutOfBoundException
		
		//using for loop
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println(ar);
		System.out.println("__________");
		
		//using jdk8 lambda loop
		ar.stream().forEach(ele ->System.out.println(ele));
		
		System.out.println("__________");
		//using iterator -- it is ainterface used to iterate values of a collection
		Iterator<String> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("__________");
		
		//generics of ArrayList : integer, string, Char, boolean etc.. 
		
		//list with other collections 
		//Array.asList is a constroctor here and we are calling it by creation of object new ArrayList
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(10,20,20,202,30,304,04,90));
		System.out.println(number);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("bombeds","bommai","fora","ganesh","raghu","radha"));
		System.out.println(names);
	
	}

}
