package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Laptop;
import com.xworkz.inheritance.orange.Computer;

public class LaptopTester {
	
	public static void main(String args[]) {
		
		Laptop lp=new Laptop();
		lp.toStoreData("hp");
		System.out.println("laptop name is "+ " "+ lp.brandName);
		
		Computer cp=new Computer();
		cp.toStoreData("lenovo");
		System.out.println("laptop name is "+ " "+ cp.brandName);
		
	}

}
