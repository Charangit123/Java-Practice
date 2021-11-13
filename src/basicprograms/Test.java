package basicprograms;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class Test {

	
	
	public static void main(String[] args) {
		String k="apple";
		System.out.println(k.compareTo(k));
		
		ArrayList<String>arr= new ArrayList<>();
		arr.add("rotm");
		arr.add("ho");
		arr.add("2");
		arr.add("too");
		arr.add("rew");
	System.out.println(arr.size());	
Collections.sort(arr);
System.out.println(arr);
System.out.println(Calendar.getInstance().getTime());
System.out.println(new Date(System.currentTimeMillis()));

try{
    System.out.print("Hello World");
}catch(Exception e){
    System.out.println("lkjhdfghjk");

}

	finally{
    System.out.println("!");
}


	}

}
