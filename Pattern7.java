package com.xworkx.interview;

public class Pattern7 {
	public static void main(String args[]) {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1||col==1||row==5||col==5) {
					
					System.out.print("1");
					
				}
				else {
					System.out.print("0");
				}
				
			}
			System.out.println();
			
		}
		
	}

}
