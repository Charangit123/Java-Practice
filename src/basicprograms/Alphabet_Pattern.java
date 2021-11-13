package basicprograms;

import javax.management.ValueExp;

public class Alphabet_Pattern {

	public static void main(String[] args) {
	
/*
 ABCDEFGHIJKLMNOPQRSTUVWXYZk
 */
		for(int i=0;i<26;i++) {
		System.out.print((char)(i+65));
		}
		
		System.out.println();

/*
 abcdefghijklmnopqrstuvwxyz
 */
		for(int i=0;i<26;i++) {
			System.out.print((char)(i+97));
			}
	System.out.println();
		
/*
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
A B C D E F G 
A B C D E F G H 
 */
		for(int i=0;i<=7;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}

/*
a 
a b 
a b c 
a b c d 
a b c d e 
a b c d e f 
a b c d e f g 
a b c d e f g h 
 */
		for(int i=0;i<=7;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(j+97)+" ");
			}
			System.out.println();
		}
		
/*
 
A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 
G G G G G G G 
H H H H H H H H
 
 */

		for(int i=0;i<=7;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(65+i)+" ");
			}
			System.out.println();
		}
	}

}
