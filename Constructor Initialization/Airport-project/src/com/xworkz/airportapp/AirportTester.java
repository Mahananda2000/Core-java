//standard package it contains only main method
package com.xworkz.airportapp;

public class AirportTester {
    public static void main(String args[]){
	  
	    Airport.addAirportNames("Rajeev Gandhi International Airport");
		Airport.addAirportNames("Indira Gandhi International Airport");
		Airport.addAirportNames("Kempegouda International Airport");
      Airport.addAirportNames("Netaji Subhas Chandr Bose Airport");
		Airport.addAirportNames("Chhatrapati Shivaji International Airport");
		Airport.addAirportNames("Anna International Airport");
		Airport.addAirportNames("Cochin International Airport");
	   
		Airport.getAirportNames();
	  
	}

}