package basicprograms;

public class MissingElemnt {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,6,7,8,9};
		int missinNumb=missingnumber(ar,9);
		System.out.println("MissinNumb:"+missinNumb);
	}

	public static int missingnumber(int arr[], int totalsum) {
		totalsum=(totalsum)*(totalsum+1)/2;
		int actualsum=0;
		for(Integer i : arr) {
			actualsum+=i;
		}
		
		return totalsum-actualsum;
	}
}
