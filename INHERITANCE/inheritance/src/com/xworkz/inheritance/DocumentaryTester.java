package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Documentary;
import com.xworkz.inheritance.orange.File;

public class DocumentaryTester {
public static void main(String args[]) {
		
        Documentary doc = new Documentary();
		doc.toWatch("Gandhadhgudi");
		System.out.println(" Dr. puneeth Rajkumar last movie was "  + doc.documentoryName);
		
		
		 File fe = new File();
			fe.toWatch("googly");
			System.out.println(" Dr. puneeth Rajkumar last movie was "  + fe.documentoryName);
	}

}



