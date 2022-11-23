package com.xworkz.app;

import com.xworkz.app.VechicleDto;

public class VechicleTester {
	public static void main(String args[]) {

		VechicleDto vcl=new VechicleDto();
		vcl.setVechicleName("bike");
		vcl.setVechicleId(12);
		vcl.setPrice(20000);
		System.out.println("vechicle name is"+ " "+vcl.getVechicleName());
		System.out.println("vechicle id is "+ " "+ vcl.getVechicleId());
		System.out.println("vechicle price is "+ " "+ vcl.getPrice());
		
		
}

}
