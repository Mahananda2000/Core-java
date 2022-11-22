package com.xworkz.polymorphismapp;

import com.xworkz.polymorphismapp.Apple.Apple;
import com.xworkz.polymorphismapp.Fruits.Fruits;
import com.xworkz.polymorphismapp.Orange.Orange;

public class FruitsTester {
	
	public static void main(String args[]) {
		Fruits apple=new Apple();
		apple.getNutrition();
		
		Fruits orange=new Orange();
		orange.getNutrition();
		
		
		
	}

}
