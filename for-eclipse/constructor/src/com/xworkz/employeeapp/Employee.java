package com.xworkz.employeeapp;

public class Employee {

		
	     //instance variable initialize the using ref variable
		static public String companyName;
		static public String companyAddress;
		
		public String employeeId;
		public String name; 
		public String bloodGroup;
		//constructor ids default constructor(),=no any parametrs
		public Employee() {
			
		}
		
		//use of Constructor is to initialize the instance variable of class use of constructor is is along with object only
		public Employee(String empId,String nm, String bgroup)//paramertrized constructor  
		{
			System.out.println("Employee object is created");
			employeeId = empId;//employeeId=employeeId; if in case write this we get the result null
			name = nm;
			bloodGroup= bgroup;
		}
		public void toHelpOrgToGrow() {
		  System.out.println("nanuu nane.......");
		

	}
	}

	
	