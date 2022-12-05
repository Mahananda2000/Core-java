package com.xworkx.interview;

import java.util.Scanner;

public class FibbonacciSeries {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int nextTerm=sc.nextInt();
		//int nextTerm=0;
	
		int firstTerm=0;
		int secondTerm=1;
		for(int i=1;i<=nextTerm;i++) {
			
		nextTerm=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=nextTerm;
		}
		System.out.println(nextTerm);
		
		
		
		
	}

}
