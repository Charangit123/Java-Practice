package basicprograms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println("Is "+k+"  a prime number?  "+ primenumber(k));
		
		System.out.println("Enter a number to get prime numbers till that number:");		
		int num = sc.nextInt();
		getprimenumber(num);
	}

	public static boolean primenumber(int p) {
		
		
		if(p<=1) {
			return false;
		}
		for (int i=2;i<p;i++) {
			if(p%i==0) {
				return false;
			}}
		return true;
	}
	
	public static void getprimenumber(int range) {
		
		for(int i=2;i<range;i++) {
		if(primenumber(i)) {
			System.out.print(i+"  ");
		}
			
		}
		
	}
}
