package basicprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LengthofString {

	public static void main(String[] args) {

		String str = "Testingsample";
		System.out.println(str.toCharArray().length);
		System.out.println(str.indexOf("l"));
		System.out.println(str.lastIndexOf(""));

		Matcher m = Pattern.compile("$").matcher(str);
		System.out.println(m.find());
		int length = m.end();
		System.out.println(length);
		System.out.println(str.split("").length);

		int l = new StringBuilder(str).length();
		System.out.println(l);

		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}
		System.out.println(count);
		
		System.out.println(stringlen("hereisasampleprogram"));

		
		int l1=0;
		String st="987654";
		try {
			l1=st.getBytes("UTF-16BE").length/2;
			} catch (Exception e) {	
		}
	System.out.println(l1);
	
	System.out.println(strilength("iamnotgoinganywhere"));
	}

	
	public static int stringlen(String str) {
		int i = 0;
		try {
			while (true) {
				str.charAt(i);
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			return i;
		}
	}
	public static int  strilength(String str) {
		String st[]= str.split("going");
		int count=0;
		for(String s : st) {
			count+=s.toCharArray().length;
			System.out.print(s);
		}
		return count;
	}	

	}

