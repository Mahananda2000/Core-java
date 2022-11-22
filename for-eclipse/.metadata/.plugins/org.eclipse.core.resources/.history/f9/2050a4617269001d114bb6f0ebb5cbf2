package com.xworkz.polymorphism1app.SupplemantaryExam;

import com.xworkz.polymorphism1app.exam.Exam;

public class SupplemantaryExam extends Exam {
	int noOfAttempts ;
	public  SupplemantaryExam(int noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
		
	}
	@override
	//--@ Annotation meta data which is used to give info to the compliler
	public boolean allow(Halticket halticket) {
		System.out.println("Invoked allow method of supplementaryExam");
		if(noOfAttempts>1) {
			return super.allow(halticket);
		}
		return false;
		
	
	

}

}


