package com.xworkx.interview;

public class pattern1 {
	public static void main(String args[]) {
		
		for(int row=1;row<=5;row++){
			for(int col=1;col<=5;col++) {
				if(col==1||col==5||row==1||row==5) {
					System.out.print("#");
					
				}
				else {
					System.out.print(" ");
				}
			}
				System.out.println();
			}
			
		}
	}


