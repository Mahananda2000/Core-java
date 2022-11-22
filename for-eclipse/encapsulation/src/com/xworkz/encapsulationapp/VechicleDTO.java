package com.xworkz.encapsulationapp;

public class VechicleDTO {
	
	private String vechicleName;
	private int vechicleId;
	private double price;
	
	public void setvechicleName(String nm) {
		vechicleName=nm;
			
	}
	 public String getVechicleName() {
		 return vechicleName;
	 }
	 
	 public void setVechicleId(int id) {
		 vechicleId=id;
	 }
	 
	 public int getVechicleId() {
		 return vechicleId;
	 }
	 
	 public void setPrice(int pr) {
		 price=pr;
		 
	 }
	 
	 public double getPrice() {
		 return price;
	 }

}
