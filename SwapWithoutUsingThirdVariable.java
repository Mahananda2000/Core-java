package com.xworkx.interview;

import java.util.Scanner;

public class SwapWithoutUsingThirdVariable {
	public static void main(String args[]) {
		int a;
		int b;
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of a");
		a=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the value of b");
		b=sc1.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
		
	}

}
