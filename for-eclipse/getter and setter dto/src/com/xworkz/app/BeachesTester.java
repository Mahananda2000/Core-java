package com.xworkz.app;

import com.xworkz.app.BeachesDto;

public class BeachesTester {

	public static void main(String args[]) {
		
		BeachesDto bc=new BeachesDto();
		bc.setName("malpe");
		bc.setId(12);
		
		System.out.println("beaches name is "+" "+bc.getName());
		System.out.println("beaches id is "+ " "+ bc.getId());
	}


}
