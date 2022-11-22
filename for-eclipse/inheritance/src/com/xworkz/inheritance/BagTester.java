package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Bag;
import com.xworkz.inheritance.orange.CarryBag;
import com.xworkz.inheritance.orange.HandBag;

public class BagTester {
	public static void main(String args[]) {
		
		Bag bg =new  Bag();
		bg.toCarry("kista");
		System.out.println("bag name is "+ " "+ bg.name);

		CarryBag hb =new  CarryBag();
		hb.toCarry("boat");
		System.out.println("Handbag name is "+ " "+ hb.name);
		 
		 
		
	}

}
