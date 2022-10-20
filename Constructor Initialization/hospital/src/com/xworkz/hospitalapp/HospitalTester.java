package com.xworkz.hospitalapp;

//import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalTester {
	public static void main(String args[]) {
		Hospital hospital =new Hospital();
		hospital.savePatientNames("Ganesh");
		hospital.savePatientNames("Manesh");
		hospital.savePatientNames("Guna");
		hospital.savePatientNames("Harish");
		hospital.savePatientNames("Snadesh");
		hospital.savePatientNames("Yogesh");
		hospital.getPatientNames();
		
		hospital.updatePatientNames("Guna","Guna Sarakar");
		hospital.getPatientNames();
	}

}