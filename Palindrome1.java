package com.xworkx.interview;

import java.util.Scanner;

public class Palindrome1 {
	public static void main(String args[]) {
	
		int digit=0;
		int rev=0;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the number");
	    int num=sc.nextInt();
	    int temp=num;
	     while(num!=0) {
	    	 digit=num%10;
	    	 rev=rev*10+digit;
	    	 num=num/10;	 
	     }
	     if(temp==rev) {
	    	 System.out.println("palindrome");
	    	 
	     }else {
	    	 System.out.println("not");
	     }
		
	}

}
