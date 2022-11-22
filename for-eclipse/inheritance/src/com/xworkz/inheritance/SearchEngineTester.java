package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.SearchEngine;
import com.xworkz.inheritance.orange.Google;

public class SearchEngineTester {
	public static void main(String[] args) {
		
		SearchEngine se = new SearchEngine();
		se.toSearch("websites");
		System.out.println("search websites you want.."+se.websiteName);
		
		Google gle = new Google();
		gle.toSearch("Facebook.com");
		System.out.println("Facebook website is.."+gle.websiteName);

	}


}
