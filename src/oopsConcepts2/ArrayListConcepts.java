package oopsConcepts2;
import java.util.ArrayList;
public class ArrayListConcepts {

	public static void main(String[] args) {
		
	ArrayList a = new ArrayList();
		a.add(100);		//0
		a.add('e');		//1
		a.add("Vlaue");		//2
		a.add(300);			//3
		a.add(true);		//4
		System.out.println(a.size());
	
		System.out.println(a.get(6));//IndexOutOfBoundsException
		
		a.remove(4);		
		
		a.add(400);			//5
		a.add(62772);		//6
		System.out.println(a.size());
		
		for(int i = 0 ; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		//generics - int - primitive data type 
		ArrayList<Integer> x= new ArrayList<Integer>();
		x.add(100);
		x.add(56);
		
		//generics - Strings - non primitive data type
		ArrayList<String> g= new ArrayList<String>();
		g.add("text");
		g.add("98");
	}

}
