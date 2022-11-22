package com.xworkz.inheritance;

import com.xworkz.inheritance.orange.DairyMilk;

public class ChacolateTester {
	public static void main(String args[]) {
		
		Chocolate choc = new Chocolate();
		choc.toGetEnjoy("chocos flavour");
		System.out.println("Chocolate falvour is" + choc.flavour);
		
		DairyMilk choc1 = new DairyMilk();
		choc1.toGetEnjoy("Milk flavour");
		System.out.println("Dairymilk flavour is " + choc1.flavour);
	}

}
