package com.xworkz.employeeapp;

public class FootWear{
	public String footWareId;
	public String color;
	public long price;
	public String brandName;
	public int size;
	public String model;
	
  
   public FootWear() {
	
        }

     public FootWear(String footId,String clr,long prc,String bName,int sz,String mdl) {
	System.out.println("FootWare object is created");
	footWareId = footId;
	color = clr;
	price= prc;
	brandName=bName;
	size=sz;
	model=mdl;
}
public void toHelpToWalk() {
  System.out.println(".......");
}
}

