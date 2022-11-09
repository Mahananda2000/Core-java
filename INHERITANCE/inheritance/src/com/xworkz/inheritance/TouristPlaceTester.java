package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.TouristPlace;
import com.xworkz.inheritance.orange.Honnavar;

public class TouristPlaceTester {
	public static void main(String args[]) {
		
		TouristPlace tp=new TouristPlace();
		tp.toVisit("bellary");
		System.out.println("the tourist name is"+ tp.name);
		
		Honnavar hv=new Honnavar();
		hv.toVisit("agumbe");
		System.out.println("the tourist name is"+ hv.name);
		

		
	}

}
