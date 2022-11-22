package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.State;
import com.xworkz.inheritance.orange.Karnataka;

public class StateTester {

	public static void main(String args[]) {
		
		State st = new State();
		st.stateOfIndia(29);
		System.out.println("Number of states in india" + st.noOfDistricts);
		
		Karnataka st1 = new Karnataka();
		st1.stateOfIndia(32);
		System.out.println("Number of districts in karnatak" +st1.noOfDistricts);
	}

}



