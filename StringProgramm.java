package com.xworkx.interview;

public class StringProgramm {
	
	public static void main(String args[]) {
		//reverse string
		String name="Programming langauge";
	    System.out.println(name);
	    
	    //in built
	    for(int i=0;i<name.length();i++) {
	    	System.out.print(" "+name.charAt(i));
	    	
	    }
	    //String reverse
	     for(int i=name.length()-1;i>=0;i--) { 
	    	 System.out.print(" "+name.charAt(i)); 
	     }
	     
	     //counting given character
	     int count=0;
	     int count1=0;
	     for(int i=0;i<name.length();i++) {
	    	 if(name.charAt(i)=='a') {
	    		 count+=1;
	    		 
	    	 }
	    	 else {
	    	 count1+=1;
	     }
	     }
	     System.out.println(count);
	     System.out.println(count1);
	     
	     //without using string length method
	     int count2=0;
	     int count3=0;
	     String str="Good Learning";
	     for(char ch:str.toCharArray()) {
	    	 if(ch=='o') {
	    		 count2+=1;
	    	 }
	    	 else {
	    		 count3+=1;
	    	 }
	    	// System.out.print(ch+" ");
	     }
	     System.out.println("count:"+count2);
	     System.out.println("count:"+count3);
		    
	     //g o o d l e a r n i n n g 
	     String str1="Good Learning";
	     for(char ch:str1.toCharArray()) {
	    	 System.out.print(ch+" ");
	     }
	     //compare String
	     String name1="nayan";
	     String reverse="";
	     for(int i=name1.length()-1;i>=0;i--) {
	    	 reverse+=name1.charAt(i);
	    	 
	     }
	     if(name1.equals(reverse)) {
	    	 System.out.println("mached");
	     }
	     else {
	    	 System.out.println("not matched");
	     }
	     	
	     //reverse number
	    int  num = 123;
	    int reverse1= 1;
	    int digit,temp=0;
	    while(num>0) {
	       digit=num%10;
	    	reverse1=reverse1*10+digit;
	    	num=num/10;
	    }
	    if(temp==reverse1) {
	    	System.out.println("palindrome");
	    	
	    }else {
	    	System.out.println("not");
	    }
	    
	    //logical and ,or op:12345
	    for(int row=1;row<=5;row++) {
	    	for(int col=1;col<=5;col++) {
	    		if(row==2 && col==5) {
	    		  System.out.println("xworkz");	
	    		}
	    		else {
	    			
	    		System.out.print(col);	    		
	    	}
	    	}
	    	System.out.println();
	    }
	    
	    }    
	     
	
	    	
	}


