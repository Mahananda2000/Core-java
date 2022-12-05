package com.xworkx.interview;

public class Pattern5 {
	public static void main(String args[]) {
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=3;col++) {
				if(col==1&&row==1||col==1&&row==2||col==1&& row==3||col==2&&row==4||col==3&&row==1||col==3&&row==2||col==3&&row==3) {
					System.out.print("@");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
	}

}
