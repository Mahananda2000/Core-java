package com.xworkx.interview;

public class Pattern4 {
	public static void main(String args[]) {
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=3;col++) {
				if(col==1||col==3||col==2 &&row==2) {
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
