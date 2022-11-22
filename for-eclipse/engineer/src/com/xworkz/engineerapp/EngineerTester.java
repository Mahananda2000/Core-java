package com.xworkz.engineerapp;

import com.xworkz.engineerapp.CsEngineer.CsEngineer;
import com.xworkz.engineerapp.engineer.EcEngineer;
import com.xworkz.engineerapp.engineer.Engineer;

public class EngineerTester {
	
	public static void main(String args[]) {
		
		/*polymorphism
		Object object= new EcEngineer();*/
		
		Engineer ecEngineer = new EcEngineer();
		ecEngineer.solveProblems();
		
		Engineer csEngineer= new CsEngineer();
		csEngineer.solveProblems();
		
		//Engineer
		
	}

}
