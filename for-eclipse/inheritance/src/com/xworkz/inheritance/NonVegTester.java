package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Fruit;
import com.xworkz.inheritance.fruit.NonVeg;
import com.xworkz.inheritance.orange.Chicken;

public class NonVegTester {
public static void main(String args[]) {
		
		NonVeg nv = new NonVeg();
		nv.toGetProtien("kabab");
		System.out.println("reciepe of non veg is" + nv.reciepe);
		
		Chicken ck = new Chicken();
	    ck.toGetProtien("chiken kabab");
	    System.out.println("reciepe of non veg is"+ ck.reciepe);

}
}
