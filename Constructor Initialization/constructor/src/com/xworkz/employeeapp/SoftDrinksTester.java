package com.xworkz.employeeapp;

public class SoftDrinksTester {
public static void main(String args[]) {
		
		SoftDrinks sd = new SoftDrinks("ice1",100,"ofc","grape");
		System.out.println("SoftDrinks Details");
		System.out.println(sd.softDrinksId +" "+sd.price +" "+sd.brandName +" "+sd.type);
		
		SoftDrinks sd1 = new SoftDrinks("ice12",200,"kf","lemonlive");
		System.out.println("SoftDrinks Details");
		System.out.println(sd1.softDrinksId +" "+sd1.price +" "+sd1.brandName +" "+sd1.type);
		
		SoftDrinks sd2 = new SoftDrinks("ice111",1300,"oldmonk","orange");
		System.out.println("SoftDrinks Details");
		System.out.println(sd2.softDrinksId +" "+sd2.price +" "+sd2.brandName +" "+sd2.type);
		

}
}
