package programs2;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

public class VowelCount {

	public static void main(String[] args) {

		// Java
		String str = "saicharan";
		// "here i am find number of vowels in a string";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Vowel(str.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);

		
		
		// Java 8 Streams
		IntPredicate vowel = new IntPredicate() {
			@Override
			public boolean test(int st) {
				return st == 'a' || st == 'e' || st == 'i' || st == 'o' || st == 'u' || st == 'A' || st == 'E'
						|| st == 'I' || st == 'O' || st == 'U';
			}
		};
		String stng = "aeiouAEIOU";
		long value = stng.chars().filter(vowel).count();
		System.out.println(value);

		
		
		//Guava google jar
		String st1 = "Javacollection";
		int countV= CharMatcher.anyOf("aeiouAEIOU").countIn(st1);
		System.out.println(countV);
		
		
	}

	public static boolean Vowel(char st) {
		return st == 'a' || st == 'e' || st == 'i' || st == 'o' || st == 'u' || st == 'A' || st == 'E' || st == 'I'
				|| st == 'O' || st == 'U';
	}

}
