package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Sweet;
import com.xworkz.inheritance.orange.Barfi;


public class SweetTester {
	public static void main(String args[]) {
		
	
	Sweet st = new Sweet();
	st.toGetProtien("peda");
	System.out.println("name of the sweeet is" + st.name);
	
	Barfi bf= new Barfi();
    bf.toGetProtien("coconutbarfi");
    System.out.println("name of the sweet is"+ bf.name);

}
}
