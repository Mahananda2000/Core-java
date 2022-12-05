package com.xworkx.interview;

public class Pattern6 {
	public static void main(String args[]) {
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=4;col++) {
				if(row==1&&col==1||row==7&&col==1||row==2&&col==2||row==5&&col==3||row==6&&col==2||row==3&&col==3||row==4&&col==4) {
					System.out.print("#");
				}
				else {
					System.out.print("0");
				}
				
			}
			System.out.println();
			
		}
		
	}

}
