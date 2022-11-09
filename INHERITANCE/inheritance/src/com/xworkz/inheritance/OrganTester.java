package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Organ;
import com.xworkz.inheritance.orange.Body;

public class OrganTester {
	public static void main(String args[]) {
		
		Organ og=new Organ();
		og.toSurvive("eye");
		System.out.println("organ name is " +" "+ og.name);
		
				
		Body bd=new Body();
		bd.toSurvive("ear");
		System.out.println("organ name is "+ " "+ bd.name);		
		
	}

}
