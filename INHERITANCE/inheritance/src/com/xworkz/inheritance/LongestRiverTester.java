package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.LongestRiver;
import com.xworkz.inheritance.orange.Nail;

public class LongestRiverTester {
public static void main(String args[]) {
		
		LongestRiver lr = new LongestRiver();
		lr.toGetPeace("6600 Kms"); 
		System.out.println("The river flows over..."+lr.flowsOver);
		
		Nail lr1 = new Nail();
		lr.toGetPeace("4100 miles"); 
		System.out.println("The nile river flows over.."+lr1.flowsOver);
		
				
		
	}

}
