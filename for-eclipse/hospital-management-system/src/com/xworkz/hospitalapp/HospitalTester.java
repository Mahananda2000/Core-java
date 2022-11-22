package com.xworkz.hospitalapp;


import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {
	public static void main(String args[]) {
		//file handling 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the patientName");//take the data at runtime
		 String patientName =scan.next();

		System.out.println("enter the patient address");
		 String address=scan.next();

		System.out.println("enter the age");
		 int age=scan.nextInt();
		Patient patient=new Patient(patientName,address,Gender.female,age);//enum.value
		Hospital hl=new Hospital();
	    hl.isEmergency=true;
		hl.isTreatmentRequired=true;;
		boolean isAdmitted=hl.admit(patient);
		System.out.println(Gender.female);
		System.out.println("it is emergency"+isAdmitted);
		System.out.println("patient allowed to admit is "+ isAdmitted);
		//first create an object of scanner=1 number of parameter,system.in is inside the scanner input will be coming from the scanner it is used to argeument of scanner
		
		scan.close();//pupose it is used to close the scanner return type is void
		//why java is not purely object oriented programming langauage rsn java support premitive datatypes
		
	}

}
