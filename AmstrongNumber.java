package com.xworkx.interview;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String args[]) {
		int  num;
		int sum=0;
		
		int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");	
		 num=sc.nextInt();
		 int temp=num;
		
		while(num>0) {
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);	
		}
		if(temp==sum) {
			System.out.println("number");
			
		}
		else {
			System.out.println("not");
		}
		
	}

}
