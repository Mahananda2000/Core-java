package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Emotion;
import com.xworkz.inheritance.orange.RoyalEnfield;

public class EmotionTester {
public static void main(String args[]) {
		
		Emotion em = new Emotion();
		em.toEnjoyRide("30 to 35 km/l");
		System.out.println("The bike mileage..."+em.mileage);
		
		RoyalEnfield em1 = new RoyalEnfield();
		em1.toEnjoyRide("35 to 37 km/l");
		System.out.println("The royal enfield mileage is..."+em1.mileage);
	}
}



