package com.xworkx.interview;

public class Pattern8 {
	public static void main(String args[]) {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1&&row==1||col==1&&row==2||col==1&&row==3||col==1&&row==4||col==1&&row==5||row==2&&col==2||row==3&&col==3||row==4&&col==4||row==5&&col==5) {
					System.out.print("5");
					
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
	}

}
