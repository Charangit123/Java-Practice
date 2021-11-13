package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisationConcepts {

	public static void main(String[] args) {

		// 1. Collections.synchronizedList
		List<String> namelist = Collections.synchronizedList(new ArrayList<String>());
		namelist.add("Gujral");
		namelist.add("vpsingh");
		namelist.add("charansingh");
			//add, remove - we don't need explicit synchroniasation
			// to fetch/traverse the values from list --we need explicit synchronation
		synchronized (namelist) {
			Iterator<String> it = namelist.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
		System.out.println("------------");
		
		//2. copyOnWriteArrayList--- it is a class : ThreadSafe/synchronized already.
		CopyOnWriteArrayList<String> list1= new CopyOnWriteArrayList<String>();
		list1.add("tom");
		list1.add("steve");
		list1.add("raju");
		
		//we don't need explicit synchronization for any operation-- add/remove/fetch 
		Iterator<String> it1=list1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
