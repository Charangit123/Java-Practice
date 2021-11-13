package final_finally_finalize_difference;
//doubt 
public class FinalizeC {

	public  void finalize() {
		System.out.println("in finilise class now");
		
	}

	public static void main(String[] args) {
//if there are null objects and variables garbage collector will make the objects refences  erased from memory and just befor doing that Sysyem.gc calls the finaliZe method.
	FinalizeC f1 = new FinalizeC();
	FinalizeC f2 = new FinalizeC();
	
	f1=null;
	f2=null;
	System.gc();//removes all null value refences
	
	}
	
	
}
