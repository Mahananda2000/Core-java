package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Festival;
import com.xworkz.inheritance.orange.Diwali;

public class FestivalTester {
public static void main(String args[]) {
		
		Festival fstl = new Festival();
		fstl.toCelebrate(4000);
		System.out.println("Price of the Ganesha murti is " + fstl.priceOfCrackers);
		
		Diwali dw = new Diwali();
		dw.toCelebrate(4000);
		System.out.println("Price of the Ganesha murti is " + dw.priceOfCrackers);
	}

}



