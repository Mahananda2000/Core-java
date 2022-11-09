package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Biscuit;
import com.xworkz.inheritance.orange.Oreo;

public class BiscuitTester {
public static void main(String args[]) {
		
		Biscuit bis = new Biscuit();
		bis.toEat(10);
		System.out.println("Biscuit price is.."+bis.price);
		
		Oreo or = new Oreo();
		or.toEat(25);
		System.out.println("Oreo biscuit price is.."+or.price);
	}
}



