package com.xworkz.employeeapp;

public class Airport {
		//instance 
		String name= "BIA";
		//static variable need not to create an object
		//static is a single copy
		//instance is a multiple copy
		public static void main(String aregs[]) {//multiple object of a class using new keyword
			
			
			//system.out.println(Airport.name);
			
			Airport airport =new Airport();
			System.out.println(airport.name);
			airport.name="mumbai airport";
			System.out.println(airport.name);
			
			int airportId = 0;
			System.out.println(airportId);
			
		}
		
		

	}	


