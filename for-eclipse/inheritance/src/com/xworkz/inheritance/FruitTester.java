package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Apple;
import com.xworkz.inheritance.fruit.Fruit;
import com.xworkz.inheritance.orange.Orange;


public class FruitTester {
	
	public static void main(String args[]) {
		
		Fruit fru = new Fruit();
		fru.toGetHealthier(30);
		System.out.println("Price of fruit is" + fru.price);
		
		Orange org = new Orange();
		org.toGetHealthier(35);
		System.out.println("Price of orange is" + org.price);
		
		Apple ap = new Apple();
		ap.toGetHealthier(25);
		System.out.println("Price of apple is" + ap.price);
		
		
	}

}
