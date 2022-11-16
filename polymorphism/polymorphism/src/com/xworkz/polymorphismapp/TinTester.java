package com.xworkz.polymorphismapp;

import com.xworkz.polymorphismapp.Apple.Cocacola;
import com.xworkz.polymorphismapp.Fruits.Tin;
import com.xworkz.polymorphismapp.Orange.RedBull;

public class TinTester {
	public static void main(String args[]) {
		
		Tin cocacola =new Cocacola();
		cocacola.storeLiquid();
		
		Tin redBull=new RedBull();
		redBull.storeLiquid();
		
		
		
	}

}
