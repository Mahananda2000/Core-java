package com.xworkx.interview;

import java.util.Scanner;

public class RemoveWhiteSpace {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		
		char c[]=s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(c[i] != ' ') {
				System.out.print(c[i]);
				
			}
			
		}
		
 }

}
