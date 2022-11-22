package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Vegetable;
import com.xworkz.inheritance.orange.Potato;

public class VegetableTester {
	
		public static void main(String args[]) {
			
			Vegetable veg = new Vegetable();
			veg.toMakeRecipees("Phalav");
			System.out.println("Vegetables are used to make" + veg.recipee);
			
			Potato veg1 = new Potato();
			veg1.toMakeRecipees("French fries");
			System.out.println("Potato is used to make" + veg1.recipee);
			
			
			
			
		}

	}


