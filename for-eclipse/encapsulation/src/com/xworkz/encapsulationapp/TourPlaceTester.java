package com.xworkz.encapsulationapp;

public class TourPlaceTester {
	
	public static void main(String args[]) {
		
		TourPlaceDTO tp= new TourPlaceDTO();
		tp.setPlaceName("chamundi hills");
		tp.setLocation(" mysore");
		System.out.println("place name is "+" "+ tp.getPlaceName());
		System.out.println("place location is "+" "+ tp.getLocation());
		
	}

}
