package com.xworkz.encapsulationapp;

public class IceCreamDTO {
	
	private String brandName;
	private String iceCreamName;
	private String flavour;
	private int price;
	
	
	public void setBrandName(String brandName) {
		this.brandName=brandName;
		
	}
	public String getBrandName() {
		return brandName;
	}
	
	public void setIceCreamName(String iceCreamName) {
		this.iceCreamName=iceCreamName;
	}
	
	public String getIceCreamName() {
		return iceCreamName;
		
	}
	
	public void setFlavour(String flavour) {
		this.flavour=flavour;
		
	}
	
	public String getFlavour() {
		return flavour;
	}
	
	public void setPrice(int price) {
		this.price=price;
		
	}
	
	public int getPrice() {
		return price;
	}
}
