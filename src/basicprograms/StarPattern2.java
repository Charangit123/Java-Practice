package basicprograms;

public class StarPattern2 {

	public static void main(String[] args) {
		
/*			
 	 *
    **
   ***
  ****
 *****
******
 
 */
		for(int i=1;i<=6;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
				}
			for(int a=1;a<=i;a++) {
			System.out.print("*");
			}
		System.out.println();
		}
		
	}

}
