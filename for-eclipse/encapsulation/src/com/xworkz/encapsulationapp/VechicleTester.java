package com.xworkz.encapsulationapp;

public class VechicleTester {
	
	public static void main(String args[]) {

		VechicleDTO vcl=new VechicleDTO();
		vcl.setvechicleName("bike");
		vcl.setVechicleId(12);
		vcl.setPrice(20000);
		System.out.println("vechicle name is"+ " "+vcl.getVechicleName());
		System.out.println("vechicle id is "+ " "+ vcl.getVechicleId());
		System.out.println("vechicle price is "+ " "+ vcl.getPrice());
		
		
}
}
