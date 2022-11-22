package com.xworkz.coffeeshopapp;

public class CoffeeShopTester {
public static void main(String args[]) {
		
		String brandNames[] = {"Nescafe", "Bru", "Country bean", "Rage", "Davidoff"};
		
		CoffeeShop coffee = new CoffeeShop("Cappuccino", brandNames, true);
		Coffee cf1 = new Coffee();
		cf1.price = 60;
		cf1.sugarStatus = true;
		boolean isConnected = cf1.filter(coffee);
		System.out.println(isConnected);
		
		CoffeeShop cof1 = new CoffeeShop("Latte", brandNames, false);
		Coffee cf2 = new Coffee();
		cf2.price = 40;
		cf2.sugarStatus = false;
		boolean isConnect = cf2.filter(cof1);
		System.out.println(isConnect);
		
	}


}
