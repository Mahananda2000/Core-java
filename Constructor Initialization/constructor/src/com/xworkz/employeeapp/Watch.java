package com.xworkz.employeeapp;

public class Watch {
	
		public String watchId;
		public String color;
		public long price;
		public String brandName;
		public String type;
		
	  
	   public Watch() {
		
	}

	public Watch(String wId,String clr,long prc,String bName,String tp) {
		System.out.println("Watch object is created");
		watchId = wId;
		color = clr;
		price= prc;
		brandName=bName;
		type=tp;
	}
	public void toHelpToSeeTime() {
	  System.out.println(".......");


	}
	  
	}

	