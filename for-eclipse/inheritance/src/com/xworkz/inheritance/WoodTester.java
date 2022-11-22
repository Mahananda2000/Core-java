package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Wood;
import com.xworkz.inheritance.orange.Material;

public class WoodTester {
	public static void main(String args[]) {
		
		Wood wd = new Wood();
		wd.toBuild("balsa Wood");
		System.out.println("Wood name  is" + " " + wd.type);
			
		Material ml = new Material();
		ml.toBuild(" Shreegandha Wood");
		System.out.println("Wood name  is" + " " + ml.type);
				
		
	}

}
