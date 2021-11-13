package arrayList_Linkedlist;

import java.util.ArrayList;

public class VirtualcapacityOfArraylist {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());// virtual capacity = 10
	ar.add(200); //virtual capacity = 9
	System.out.println(ar);
	System.out.println(ar.size());
	//ArrayList<Object> ar = new ArrayList<Object>(20); // virtual capacity = 20 
	}

}
