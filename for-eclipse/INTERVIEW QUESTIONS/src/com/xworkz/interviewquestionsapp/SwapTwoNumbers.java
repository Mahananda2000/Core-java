package com.xworkz.interviewquestionsapp;

public class SwapTwoNumbers{
	 
	public static void main(String args[]) {
		 
		int a=10;
	    int  b=20;
		
		System.out.println("before swapping of two numbers");
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping two numbers ");
		System.out.println(a);
		System.out.println(b);
	}

}
