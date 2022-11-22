package com.xworkz.inheritance;

//import com.xworkz.inheritance.fruit.TouristPlace;
import com.xworkz.inheritance.fruit.TouristPlacee;
import com.xworkz.inheritance.orange.Hampi;

public class TouristPlaceeTester {

	public static void main(String args[]) {
		
		TouristPlacee plc = new TouristPlacee();
		plc.toSeePlaces("Anjanadri bett");
		System.out.println("Tourist place is" + plc.famousPlace);
		
		Hampi plc1 = new Hampi();
		plc1.toSeePlaces("Virupaksh temple");
		System.out.println("In hampi the famous place is" + plc1.famousPlace);
		
	}


}
