package com.xworkx.interview;

import java.util.Scanner;

public class Factorial {
	
	//int i=6;
	public static void main(String args[]) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	     num=sc.nextInt();
		int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
		
	}
	System.out.println(fact);
		
	}

}
