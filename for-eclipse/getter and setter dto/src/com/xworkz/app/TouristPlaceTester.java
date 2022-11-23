package com.xworkz.app;

import com.xworkz.app.TouristPlaceDto;

public class TouristPlaceTester {
public static void main(String args[]) {
		
	TouristPlaceDto tp= new TouristPlaceDto();
		tp.setPlaceName("chamundi hills");
		tp.setLocation(" mysore");
		System.out.println("place name is "+" "+ tp.getPlaceName());
		System.out.println("place location is "+" "+ tp.getLocation());
		
	}
	

}
