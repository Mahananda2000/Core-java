package com.xworkz.exam1app;
import com.xworkz.exam1app.halticket.Halticket;

public class Exam1 {
	//exam has halticket
	
	Halticket halticket;
	public int fees;
	
	public boolean allow(Halticket halticket) {
		boolean isAllowed=false;
		System.out.println("inside allow method");
		System.out.println("The fees paid is:" +this.fees);
		if(fees>=1200) {
			System.out.println("fees is paid");
			if(halticket!=null) {
			this.halticket = halticket;
			System.out.println("Details of candidate halticket are ");
			this.halticket.displayDetails();
			isAllowed=true;
			System.out.println("halticket is been issued :now you are allowed to write exam");
		     }
		
		else {
			System.out.println("No halticket is found ");
		}
	}
	else {
		System.out.println("first pay the fees");	
	}

  return isAllowed=true;
}
}


