package com.xworkz.encapsulationapp;

public class ElectronicDeviceDTO {
	
	private String deviceName;
	private int cost;
	
	public void setDeviceName(String deviceName) {
		this.deviceName=deviceName;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	
	public void setCost(int cost) {
		this.cost=cost;
	}
	
	public int getCost() {
		return cost;
	}

}
