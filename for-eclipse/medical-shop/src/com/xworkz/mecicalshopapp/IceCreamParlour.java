package com.xworkz.mecicalshopapp;

public class IceCreamParlour {
	public String gstNo;
	public String name;
	public String address;
	public String brandNames[];
	public String typeOfIceCreams[];
	public String iceCreamFlours[];
	public int prices[];
	
	//default constructor
	public IceCreamParlour() {
		
	}
	//parameterised constructor
	/* public   IceCreamParlour(String gstNo,String name,String address,String brandNames[],String typeOfIceCreams[],String iceCreamFlours[],int prices[]) {
		System.out.println("IceCreamParlour object is Created");
		
		this.gstNo=gstNo;
		this.name=name;
		this.address=address;
		this.brandNames=brandNames;
		this.typeOfIceCreams=typeOfIceCreams;
		this.iceCreamFlours=iceCreamFlours;
		this.prices=prices;
	}*/
	public void toEnjoy() {
		System.out.println("IceCreamParlour names is "+name);
		System.out.println("=================================");
		System.out.println("IceCreamParlour gstNo is"+gstNo);
		System.out.println("=========================");
		System.out.println("IceCreamParlour address is"+address);
		
		System.out.println("===============================");
		
		System.out.println("IceCreamParlour details");
		System.out.println("IceCreamParlour brandNames");
		for(int i=0;i<brandNames.length;i++) {
			System.out.println(brandNames[i]);
			
		}
		
		System.out.println("=========================");
		System.out.println("IceCreamParlour typeOfIceCreams");
		for(int i=0;i<typeOfIceCreams.length;i++) {
			System.out.println(typeOfIceCreams[i]);
			
		}
		
		System.out.println("=========================");
		System.out.println("IceCreamParlour IceCreamsFlours");
		for(int i=0;i<iceCreamFlours.length;i++) {
			System.out.println(iceCreamFlours[i]);
		}
		
		System.out.println("=========================");
		System.out.println("IceCreamParlour prices");
		for(int i=0;i<prices.length;i++) {
			System.out.println(prices[i]);
		}
		
		
		
		
	
	}

}
