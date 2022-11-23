package com.xworkz.app;

import com.xworkz.app.ElectronicDeviceDto;

public class ElectronicDeviceTester {

	public static void main(String args[]) {
		
		ElectronicDeviceDto ed=new ElectronicDeviceDto();
			ed.setDeviceName("laptop");
			ed.setCost(25000);
			System.out.println("device name is "+ " "+ed.getDeviceName());
			System.out.println("cost is "+" "+ ed.getCost());
			
			
			
		
	}

}
