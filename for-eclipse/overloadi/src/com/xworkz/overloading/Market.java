package com.xworkz.overloading;

public class Market {
	public int id;
	public String marketName;
	public String location;
	public String vegetables[]=new String [7];
	
	//default constructor
	public Market() {
		System.out.println("default constructor is called");
	}
	
	public Market(String vegetables[]) {
		this(123,"amma supermarket","bagalkot",vegetables);
		System.out.println("one parameterised constructor is created");		
      }
	
	//parameterized constructor
	public Market(int id,String marketName,String location,String[] vegetables) {
		this();
		System.out.println("calling 4 parameterized constructor ");
		this.id=id;
		this.marketName=marketName;
		this.location=location;
		this.vegetables=vegetables;
	}
	public void provideFoods() {
		
	}
	public void displayDetails() {
		System.out.println("displayDetails() is invoked");
		System.out.println(this.id+ " "+ this.marketName+" "+ this.location);
		System.out.println("list of vegetables for "+this.marketName);
		for(int i=0;i<vegetables.length;i++) {
			System.out.println(vegetables[i]);
			
			
		}
	     
	}
	

}



