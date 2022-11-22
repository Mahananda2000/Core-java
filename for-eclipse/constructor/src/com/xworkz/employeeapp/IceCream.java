package com.xworkz.employeeapp;

	public class IceCream {
		public String iceCreamId;
		public String color;
		public long price;
		public String brandName;
		public String flavor;
		
	  
	   public IceCream() {
		
	}

	public IceCream(String iceId,String clr,long prc,String bName,String fl) {
		System.out.println("Ice cream object is created");
		iceCreamId = iceId;
		color = clr;
		price= prc;
		brandName=bName;
		flavor=fl;
	}
	public void toEat() {
	  System.out.println(".......");
	}
	}

	