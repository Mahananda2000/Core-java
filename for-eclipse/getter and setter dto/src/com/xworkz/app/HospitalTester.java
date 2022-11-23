package com.xworkz.app;

import com.xworkz.app.HospitalDto;

public class HospitalTester {
public static void main(String args[]) {
		
		HospitalDto hos = new HospitalDto();
		hos.setHospitalName("kumareshwara");
		hos.setHospitalLocation("bagalkot");
		hos.setGender("female");
		hos.setNoOfPatients(10);
		System.out.println("hospital name is "+" "+ hos.getHospitalName());
		System.out.println("hospital location is "+ " "+hos.getHospitalLocation());
		System.out.println("gender name is "+" "+hos.getGender());
		System.out.println("no of patients "+" "+ hos.getNoOfPatients());
		
	}


}
