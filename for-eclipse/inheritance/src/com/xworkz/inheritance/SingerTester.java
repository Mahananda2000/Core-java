package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Singer;

public class SingerTester {
public static void main(String args[]) {
		
        Singer song = new Singer();
		song.toGetWishes("Coffee nadu chandu");
		System.out.println("Singer is good at " + song.name);
	}

}
