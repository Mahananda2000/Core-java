package com.xworkz.overloading;

public class CarramBoard {
	
	public int id;
	public int coins;
	public String material;
	public String type;
	public String brandNames[]=new String [6];
	
	public CarramBoard() {
		System.out.println("default constructor is called");
		
	}
	public CarramBoard(String brandNames[]) {
		this(12,24,"wood","carram",brandNames);
		System.out.println("one parameterised constructor");
		
	}
	
	public CarramBoard(int id,int coins,String material,String type,String[] brandNames) {
		this();
		System.out.println("calling 4 parameterized constructor ");
		this.id=id;
		this.coins=coins;
		this.material=material;
		this.type=type;
		this.brandNames=brandNames;
		
	}
	
	public void toGetInformation() {
		
	}
	
	public void displayDetails() {
		System.out.println("displayDetails() is invoked");
		System.out.println(this.id+ " "+ this.coins+" "+this.material+" "+ this.type);
		System.out.println("list of brandNames for ");
		for(int i=0;i<brandNames.length;i++) {
			System.out.println(brandNames[i]);
			
			
		}
	     
	}
	

}



	

