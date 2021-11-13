package basicprograms;

import java.net.MalformedURLException;
import java.net.URL;

public class Ipaddress {

	public static void main(String[] args) {
	
		//what ill be the output when compared url with ip address
		try {
			System.out.println(new URL("https://naveenautomationlabs.com/")
					.equals(new URL("http://45.130.228.5")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
