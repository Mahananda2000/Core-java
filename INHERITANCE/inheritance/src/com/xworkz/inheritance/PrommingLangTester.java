package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.PrommingLang;
import com.xworkz.inheritance.orange.Java;

public class PrommingLangTester {

	public static void main(String[] args) {
		
		PrommingLang pl = new PrommingLang();
		pl.toDevelop("James gosling & team");
		System.out.println("Programming Founder is..."+pl.Founder);
		
		Java jv = new Java();
		jv.toDevelop("Developers");
		System.out.println("Java Program is used by.."+jv.Founder);

	}

}
