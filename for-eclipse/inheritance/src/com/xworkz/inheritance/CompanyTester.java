package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Company;
import com.xworkz.inheritance.orange.Organization;

public class CompanyTester {
public static void main(String args[] ){
	
	Company cm = new Company();
	cm.toGetJob("TCS");
	System.out.println("company name is "+ " "+ cm.name);
	
	
	Organization or = new Organization();
	or.toGetJob("WIPRO");
	System.out.println("company name is "+ " "+ or.name);
	
	
}
}
