package com.xworkz.hospitalapp;

public class Hospital {
	//String patientNames[]= {null,null,null,null,null};
	//Datatype variableName[]={};
	
	
	//Datatype variableNames[]= new Datatypw[size];
	String patientNames[]=new String[6];
	int index;
	
	public Hospital() {
		System.out.println("Hospital object is created");
	}
	
	 public void savePatientNames(String patientName) {
		 System.out.println("inside savePatientNames");
		 if(patientName != null && patientNames.length > index) {
			 //patientNames[0]="";
			 patientNames[index++] = patientName;
		 return ;
		 }
		 else {
			 System.out.println("patient name is full...bed illa");
		 }
		 
		 System.out.println("end of savePatientNames");
		 return ;
	 }
	 
	 public void getPatientNames() {
		 for(int i = 0; i<patientNames.length; i++) {
			 System.out.println(patientNames[i]);
		 }
	 }
	 //oldPatientName="guna";
	 //newPatientName="baba";
	 public boolean updatePatientNames(String oldPatientName, String newPatientName)
	 {
		 System.out.println("inside update patinetNames");
		 for(int i = 0; i<patientNames.length; i++) {
			 //ganesh==guna
			 if(patientNames[i] == oldPatientName) {
				patientNames[i]=  newPatientName;
				return true ;
			 }
			 else {
				 //you have to get one negative msg
			 }
			 
		 }
		 return false ;
		 
	 }

}
