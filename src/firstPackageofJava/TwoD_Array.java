package firstPackageofJava;

public class TwoD_Array {

	public static void main(String[] args) {
		int x[][]= new int[2][4];
		
	//	int[][]j = new int[0][0];	// we can initialize [] before of variable also
		
		x[0][0]=1;
		x[0][1]=2;
		x[0][2]=3;
		x[0][3]=4;
		
		x[1][0]=5;
		x[1][1]=6;
		x[1][2]=7;
		x[1][3]=8;

		System.out.println(x.length); //we get row length
		System.out.println(x[1].length);// we get colomn length 
		System.out.println(x[1][3]);
		for(int row=0;row<x.length;row++) {
			System.out.println("");
			for(int colmn=0;colmn<x[0].length;colmn++) {
				System.out.print(x[row][colmn] +"	");
			}
			
		}
		

	}

}
