package javaCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Concepts {

	public static void main(String[] args) {
		Vector<Integer> vect = new Vector<>();
		vect.add(3789);
		vect.add(548);
		vect.add(35);
		vect.add(789);
		vect.add(456);
		vect.add(45);
		vect.add(245);
		vect.add(23);
		vect.add(12);
		vect.add(12);//dublicate values are allowed
		System.out.println(vect);
		
		Collections.sort(vect);
		System.out.println(vect);
		
		for (Integer x : vect) {
			System.out.println(x);
		}
		
		for(int i=0; i<vect.size();i++) {
			System.out.println(vect.get(i));
		}
		
		Iterator<Integer> it=vect.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(vect.get(0));
		System.out.println(vect);
		vect.set(4,6); 
		System.out.println(vect);
		vect.remove(5);
		System.out.println(vect);
		
		Vector<Integer> vect1 = new Vector<>();
		vect1.add(90);
		vect1.add(100);
		
		vect.addAll(vect1);
		System.out.println(vect);
		vect.removeAll(vect1);
		System.out.println(vect);
		
		vect.clear();
		System.out.println(vect);
	}

}
