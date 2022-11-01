package com.xworkz.overloading;

public class PetrolBunk {
  
	
	//instance variables /states /properties/
	public int id;
	public String name;
	public String location;
	public String workersName[]=new String [7];
	
	//default constructor
	public PetrolBunk() {
		System.out.println("default constructor is called");
	}
	public PetrolBunk(String workersName[]) {
		//this(); constructor recursive not present in the java arguments only passed in the default constructor like"maha',123,
		this(123,"DeveGouwda PetrolBunk","banashankari 2nd stage",workersName);
		System.out.println("one parameterised constructor is created");		
      }
	
	//parameterized constructor
	public PetrolBunk(int id,String name,String location,String[] workersName) {
		this();//this method is always start with here only, to call a constructor
		System.out.println("calling 4 parameterized constructor ");
		this.id=id;
		this.name=name;
		this.location=location;
		this.workersName=workersName;
	}
	public void provideFuels() {
		//this();//change one constructor to another constructor
		//this method is used to communicate with one constructor to another
		//this method purpose avoid conflict between parameters 
		//this keyword only used insance variabls
	}
	public void displayDetails() {
		System.out.println("displayDetails() is invoked");
		System.out.println(this.id+ " "+ this.name+" "+ this.location);
		System.out.println("list of workers for "+this.name);
		for(int i=0;i<workersName.length;i++) {
			System.out.println(workersName[i]);
			
			
		}
	     
	}
	

}
