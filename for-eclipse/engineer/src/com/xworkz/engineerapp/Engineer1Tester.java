package com.xworkz.engineerapp;

import com.xworkz.engineerapp.CsEngineer.CsEngineer1;
import com.xworkz.engineerapp.engineer.EcEngineer;
import com.xworkz.engineerapp.engineer.EcEngineer1;
import com.xworkz.engineerapp.engineer.Engeneer1;
import com.xworkz.engineerapp.engineer.Engineer;

public class Engineer1Tester {
	public static void main(String args[]) {
	

		     Engeneer1 ecEngineer1 = new EcEngineer1();
	         String message=ecEngineer1.solveProblems();
	         System.out.println(message);
	         
	         Engeneer1 csEngineer1 = new CsEngineer1();
	         String message1=csEngineer1.solveProblems();
	         System.out.println(message1);


}
}