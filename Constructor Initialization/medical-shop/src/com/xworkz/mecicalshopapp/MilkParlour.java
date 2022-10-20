package com.xworkz.mecicalshopapp;

public class MilkParlour {
	
	public String gstNo;
	public String name;
	public String address;
	public String milkProducts[];
	public int prices[];
	public String brandNames[];
	public int noOfProducts;
	
	
	public MilkParlour(String gstNo, String name,String address,String milkProducts[],int prices[],String brandNames[],int noOfProducts) {
		System.out.println("MilkProduct object is created");
		this.gstNo=gstNo;
		this.name=name;
		this.address=address;
		this.milkProducts=milkProducts;
		this.prices=prices;
		this.brandNames=brandNames;
		this.noOfProducts=noOfProducts;
		
	}
	
	public void displayInfo() {
		System.out.println("MilkParlour name is "+name);
		System.out.println("================");
		System.out.println("MilkParlour gstNo"+gstNo);
		System.out.println("========================");
		System.out.println("MilkParlour address is "+address);
		System.out.println("========================");
		System.out.println("MilkParlour noOfProducts is"+noOfProducts);
		System.out.println("======================================");
		System.out.println("MilkParlour  details");
		System.out.println("milkProducts names");
		for(int i=0;i<milkProducts.length;i++) {
			System.out.println(milkProducts[i]);
		}
		System.out.println("==========================");
		System.out.println("milkParlour prices");
		for (int i=0; i<prices.length;i++) {
			System.out.println(prices[i]);
		}
		System.out.println("==================");
		System.out.println("milkparelour brandnames");
		for(int i=0;i<brandNames.length;i++) {
			System.out.println(brandNames[i]);
		}
		
		int noOfProducts=8;
		
		}

}
