package setConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetImplementation {
//repetition is not allowed
	
	public static void main(String[] args) {
		Set s = new HashSet<>();
		s.add("Beta");
		s.add("Alpha");
		s.add("Gamma");
		s.add("Yotta");
		s.add(null);
		System.out.println(s);
		
		 Iterator it=s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
		for (Object bj : s) {
			System.out.println(bj);
		}
		
		s.remove("Beta");
		System.out.println(s);
		
		Set<Integer> first = new HashSet<>();
		first.addAll(Arrays.asList(new Integer[] {1,3,5,6,8,9,23,65}));
		
		Set<Integer> second = new HashSet<>();
		second.addAll(Arrays.asList(new Integer[] {1,3,5,7,9,7,2,56,90}));
		
		
		
		Set<Integer> union = new HashSet<>(first);
		union.addAll(second);
		System.out.println(union);//union of arrays
		
		Set<Integer> intersection = new HashSet<>(first);
		intersection.retainAll(second);
		System.out.println(intersection);// intersection of arrays
		
		Set<Integer> differ = new HashSet<>(first);
		differ.removeAll(second);
		System.out.println(differ);
		
		Set<Integer> remove = new HashSet<>(first);
		remove.removeAll(first);
		System.out.println(remove);
	}

}
