package week3ass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> browsers = new ArrayList<>();
		browsers.add("HCL");
		browsers.add("Aspire system");
		browsers.add("CTS");
		
	System.out.println("Size "+browsers.size());
		
		//To Sort a List
		Collections.sort(browsers);
		//To reverse a List, but has to be used after sort
		Collections.reverse(browsers);
		
		for (String eachBrowser : browsers) {
			System.out.println(eachBrowser);
		}
		
	}

}
