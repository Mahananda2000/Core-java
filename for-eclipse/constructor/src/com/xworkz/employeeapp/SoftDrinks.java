package com.xworkz.employeeapp;

public class SoftDrinks {
	public String softDrinksId;
	public long price;
	public String brandName;
	public String type;
	
  
   public SoftDrinks() {
	
}

public SoftDrinks(String softId,long prc,String bName,String tp) {
	System.out.println("SoftDrinks object is created");
	softDrinksId = softId;
	price= prc;
	brandName=bName;
	type=tp;
}
public void toHelpToDriks() {
  System.out.println(".......");


}
  
}


