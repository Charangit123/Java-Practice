package basicprograms;

public class Star_pyramid {

	public static void main(String[] args) {
		
		/*
		 
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * *
		
		 */
		
		for(int i=1;i<=7;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
				}
			for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");//adding a space
			}
			System.out.println();	
		}
/*		
          1 
	     1 2 
	    1 2 3 
	   1 2 3 4 
	  1 2 3 4 5 
	 1 2 3 4 5 6 
	1 2 3 4 5 6 7 
*/
	
		for(int i=1;i<=7;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
				}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");//adding a space
			}
			System.out.println();	
		}
	}

}
