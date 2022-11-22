package com.xworkz.interviewquestionsapp;

public class ReverseNumber {
	
	public static void main(String args[]) {
		int num=1234;
		int rev=0;
		int digit;
		while(num!=0) {
			digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
			
		}
			System.out.println(rev);	
		}
	}


