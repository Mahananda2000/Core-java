package com.xworkz.inheritance.fruit;

public class ComedianTester {
public static void main(String args[]) {
		
        Comedian cmdy = new Comedian();
		cmdy.toLough("Jocker");
		System.out.println(" Comedian is also called "  + cmdy.anotherName);
		
	     Sadu sd = new Sadu();
		sd.toLough("comedy");
		System.out.println(" Comedian is also called "  + sd.anotherName);
	}

}



