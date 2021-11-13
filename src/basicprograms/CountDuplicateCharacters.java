package basicprograms;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class CountDuplicateCharacters {

	public static void main(String[] args) {

/*		String st = "hiraiamsaicharan";
		System.out.println(st.length());
		for (int i = 0; i <= st.length() - 1; i++) {
			int count = 1;
			for (int j = i + 1; j <= st.length() - 1; j++) {
				if (st.charAt(i) == st.charAt(j)) {
					++count;
				}
			}
		System.out.println(st.charAt(i) + ":" + count);
*/
		String st ="I am a good boy and i will strive for it";
		countofCharacter(st, 'o');
		charat(st,' ');
		streams(st,"a");
		stringutils(st,'l');
	}

	//1.CharAray--foreach loop
	public static void countofCharacter( String str, char val) {
		int count=0;
		for(char c: str.toCharArray()) {
			if (c== val) {
				++count;
			}
		}
		System.out.println(val+":"+count);
	}
	
	//2.charAt(i)
	public static void charat(String str, char val) {
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)==val) {
				++count;
			}
		}
		System.out.println(val+":"+count);
	}
	
	//3.Apache common stringutility
	public static void stringutils( String str, char val) {
		int count =StringUtils.countMatches(str, val);
		System.out.println(val+":"+count);
	}
	
	//4.Streams
	public static void streams(String str, String val) {
		long count =str.chars()
				.mapToObj(e -> String.valueOf((char)e))
				.filter(e ->e.equals(val)).count();
		System.out.println(val+":"+count);
	}
}


