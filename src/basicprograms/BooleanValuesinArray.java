package basicprograms;

import java.util.ArrayList;
import java.util.List;

public class BooleanValuesinArray {

	public static void main(String[] args) {
		List<Boolean> arr=new ArrayList<>();
		arr.add(true);
		//String k ="hahahah";
		arr.add(Boolean.parseBoolean("faLSE"));
		arr.add(Boolean.TRUE);
		System.out.println(arr.size());
		System.out.println(arr);
		System.out.println(arr.get(1) instanceof Boolean);
	}

}
