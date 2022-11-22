package com.xworkz.exam1app;

import com.xworkz.exam1app.halticket.Halticket;

public class Exam1Tester {
	
	public static void main(String args[]) {
		String subjectNames[]={"m1","os","vlsi","dme1"};
		Halticket halticket=new Halticket("Manga",subjectNames,"2LB18EC006","dabba vtu");
		
		Exam1 exam=new Exam1();
		exam.fees=1200;
		boolean isAllowed =exam.allow(halticket);
		System.out.println("Allowed write an exam"+isAllowed);
		
		
		Halticket halticket1=new Halticket("Manga",subjectNames,"2LB18EC006","dabba vtu");
		
		Exam1 exam1=new Exam1();
		exam1.fees=1200;
		boolean isAllowed1=exam1.allow(halticket1);
		System.out.println("Allowed write an exam"+isAllowed1);
		
		
	}

}
