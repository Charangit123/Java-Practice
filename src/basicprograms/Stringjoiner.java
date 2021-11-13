package basicprograms;

import java.util.StringJoiner;

public class Stringjoiner {

	public static void main(String[] args) {
		
	StringJoiner Joiner=new StringJoiner("|","[" ,"]" ); 
	
	Joiner.add("Ramu").add("orey").add("osey").add("odiyamma");
	System.out.println(Joiner);
	
	}

}
