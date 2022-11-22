package com.xworkz.encapsulationapp;

public class PersonTester {
	
	public static void main(String args[]) {
		PersonDTO per=new PersonDTO();
		per.setPersonName("devendra singh");
		per.setJobRole("Network engineer");
		per.setLocation("bengaluru");
		System.out.println("person name is "+ " "+ per.getPersonName());
		System.out.println("person jobrole is "+ " "+ per.getJobRole());
		System.out.println("person location is "+ " "+ per.getLocation());
		
	}

}
