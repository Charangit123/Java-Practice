package arrayList_Linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLIst {
	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();

		// add
		l.add(89);
		l.add(45);
		l.add(23);
		l.add(86);
		//sorting of list
		Collections.sort(l);
		System.out.println(l);
		System.out.println("---------------------");
		l.add(1);
		l.add(1, 32);
		System.out.println(l);

		l.remove(1);
		System.out.println(l);

// addfirst
		l.addFirst(876778);
		System.out.println(l);
		System.out.println("-----------------------");

//addlast
		l.addLast(90765567);
		System.out.println(l);

		System.out.println("-------------------");

//get
		System.out.println(l.get(0));
		System.out.println("-----------------");

//set
		l.set(0, 1000);
		System.out.println(l.get(0));
		System.out.println("----------------");

//removefirst , remove last
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		System.out.println("---------------------");

//remove  -- removes a value of index 
		l.remove(3);
		System.out.println(l);
		System.out.println("-------------------");

//print LinkedList using forloop, 
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

		System.out.println("------------------");

//advancefor loop or for each, 
		for (Integer x : l) {
			System.out.println(x);
		}
		System.out.println("----------------------");

//iterator
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------");

//while
		int num = 0;
		while (num < l.size()) {
			System.out.println(l.get(num));
			num++;
		}

		System.out.println("----------------");
		LinkedList<Object> list1 = new LinkedList<Object>();
		
		list1.add("Tom");
		list1.add("Ramu");
		list1.add(2345);
		list1.add(2,"Varun");// add inserts the value to the index and shifts all other values to right
		
		list1.set(0, "hi ra mama");//set delets the existing index value
		System.out.println(list1);
		System.out.println("----------------");
		
//descendingiterator
		 Iterator it5=list1.descendingIterator();
		while(it5.hasNext()) {
			System.out.println(it5.next());
		}
		 
		//some other methods..
		// addFirst();
//		addLast();
//		removeFirst();
//		removeLast();
		
		 
//Collections.sort
//		Collections.sort(list1); //not applicable for object
	}
}