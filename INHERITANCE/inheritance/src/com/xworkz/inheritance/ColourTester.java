package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Color;
import com.xworkz.inheritance.orange.Shining;

public class ColourTester {
	
	public static void main(String args[]) {
		
		Color cl=new Color();
		cl.toGetBrightness("pink");
		System.out.println("colour name is"+ cl.colour);
		
		Shining sg=new Shining();
		sg.toGetBrightness("red");
		System.out.println("colour name is "+ sg.colour);
	}

}
