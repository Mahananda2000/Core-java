package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.God;
import com.xworkz.inheritance.orange.Temple;

public class GodTester {
	public static void main(String args[]) {
		
		
		God gd=new God();
		gd.togoodness("ganesh");
		System.out.println("god name is "+ " "+gd.name);
		
		Temple tl=new Temple();
		tl.togoodness("sai baba");
		System.out.println("god name is "+ " "+tl.name);
	}

}
