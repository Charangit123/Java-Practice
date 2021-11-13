package javaCollections;

import java.util.Vector;

public class Vector_2D {

	public static void main(String[] args) {
		
		Vector vect = new Vector<>();
		
		vect.add("First");
		vect.add(12);
		vect.add('A');
		vect.add(true);
		vect.add(34);
		System.out.println(vect);
		
		Vector vect2 = new Vector<>();
		vect2.add(vect);
	
		for (int i=0; i<vect.size();i++) {
			
			Object obj=(Object)((Vector)vect2.get(0)).get(i); //Casting of Vector1 to vectot 2 and calling the values normally
			System.out.println(obj);
			
		}
	}

}
