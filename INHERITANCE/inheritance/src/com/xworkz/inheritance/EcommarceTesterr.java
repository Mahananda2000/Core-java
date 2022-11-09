package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Ecommarce;
import com.xworkz.inheritance.orange.Flipkart;

public class EcommarceTesterr {

	public static void main(String args[]) {
		
		Ecommarce com = new Ecommarce();
		com.toBuyProducts("Mesho");
		System.out.println("One of the famous ecommece website is" + com.product);
		
		Flipkart com1 = new Flipkart();
		com1.toBuyProducts("Dress");
		System.out.println("Famous product in flipcart is"  + com1.product);
		
		com.toMakeShopping();
		
		
		
		
	}
	
}
