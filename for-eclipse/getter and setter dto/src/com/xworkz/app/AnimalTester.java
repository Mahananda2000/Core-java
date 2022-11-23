package com.xworkz.app;

//import com.xworkz.encapsulationapp.AnimalDTO;

public class AnimalTester {
	public static void main (String args[]) {
		
		
		AnimalDto an=new AnimalDto();
		an.setName("elephant");
		an.setColour("black");
		System.out.println("animal name is "+" "+an.getName());
		System.out.println("animal colour is"+ " "+an.getColour());
		
		
	}


}
