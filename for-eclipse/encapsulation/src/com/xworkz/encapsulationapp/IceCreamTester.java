package com.xworkz.encapsulationapp;

public class IceCreamTester {
	
	public static void main(String args[]) {
		IceCreamDTO ic= new IceCreamDTO();
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
