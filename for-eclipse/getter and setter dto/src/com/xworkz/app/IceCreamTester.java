package com.xworkz.app;

import com.xworkz.app.IceCreamDto;

public class IceCreamTester {
	public static void main(String args[]) {
		IceCreamDto ic= new IceCreamDto();
		ic.setBrandName("aruna");
		ic.setIceCreamName("candy");
		ic.setFlavour("straberry");
		ic.setPrice(25);
		System.out.println("brand name is "+ " "+ ic.getBrandName());
		System.out.println("ice cream  name is "+ " "+ ic.getIceCreamName());
		System.out.println("brand name is "+ " "+ ic.getFlavour());
		System.out.println("brand name is "+ " "+ ic.getPrice());
		
		
	}


}
