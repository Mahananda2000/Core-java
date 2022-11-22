package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

public class Patient { 
	
	public String patientName;
	public String address;
	public Gender gender;//gender is a enum it helps to write a constants
	public int age;
	
	public Patient(String patientName,String address,Gender gender,int age) {
		this.patientName=patientName;
		this.address=address;
		this.gender=gender;	
		this.age=age;
	}
	
	public void displayInfo() {
		System.out.println("patient name is: "+ patientName);
		System.out.println("patient address is: "+ address);
		System.out.println("patient gender is: "+ gender);
		System.out.println("patient age is: "+ age);
		
	}

	

}
