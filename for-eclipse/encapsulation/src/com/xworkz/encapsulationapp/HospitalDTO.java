package com.xworkz.encapsulationapp;

public class HospitalDTO {
	
	private String hospitalName;
	private String hospitalLocation;
	private String gender;
	private int noOfPatients;
	
	public void setHospitalName(String hospitalName) {
		this.hospitalName=hospitalName;	
	}
	
	public String getHospitalName() {
		return hospitalName;	
	}
	
	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation=hospitalLocation;	
	}
	
	public String getHospitalLocation() {
		return hospitalLocation;
	}
	
	public void setGender(String gender) {
		this.gender=gender;	
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients=noOfPatients;	
	}
	
	public int getNoOfPatients() {
		return noOfPatients;
	}
	
	
}
