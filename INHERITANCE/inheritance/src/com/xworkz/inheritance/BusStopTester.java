package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.BusStop;
import com.xworkz.inheritance.orange.Majestic;

public class BusStopTester {
	public static void main(String args[]) {
		BusStop bs = new BusStop();
		bs.toTravel(50);
		System.out.println("Bus tickent amount is.."+bs.ticket);
		
		Majestic mj = new Majestic();
		mj.toTravel(30);
		System.out.println("Majestic bus ticket amount is.."+ mj.ticket);
		}
}



