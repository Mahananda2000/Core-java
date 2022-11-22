package com.xworkz.encapsulationapp;

public class PersonDTO {
	
	private  String personName;
	private String jobRole;
	private String location;
	
	
    public void setPersonName(String name) {
    	this.personName=name;
    	
    }
    public String getPersonName() {
    	return personName;
    }
    
    public void setJobRole(String role) {
    	this.jobRole=role;
    }
    
    public String getJobRole() {
    	return jobRole;
    }
    
    public void setLocation(String location) {
    	
    	this.location=location;
    	
    }
    
    public String getLocation() {
    	return location;
    }

}
