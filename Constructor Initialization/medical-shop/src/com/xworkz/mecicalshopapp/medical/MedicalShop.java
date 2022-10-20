package com.xworkz.mecicalshopapp.medical;

public class MedicalShop {
	public String gstNo;
	public String address;
	public String name;
	public String staffNames[];
	public long staffContactNo[];
	public String medicineNames[];
	public String cosmetics[];
	public int noOfSections;
	public String billingMethods[];
	//to avoid the instance varaible to avoid the complict between parameter and instance  variable used the this keyword
	
	public MedicalShop(String gstNo, String name, String address, String staffNames[],long staffContactNo[],String medicineNames[],String cosmetics[],int noOfSections,String billingMethods[]) {
		
		
		System.out.println("Medical Shop Object is Created");
		this.gstNo = gstNo;
		this.name=name;
		this.address=address;
		this.staffNames=staffNames;
		this.staffContactNo=staffContactNo;
		this.medicineNames=medicineNames;
		this.cosmetics=cosmetics;
		this.noOfSections=noOfSections;
		this.billingMethods=billingMethods;
			
	}
	public void displayInfo() {
		System.out.println("Medical Shop Name is " +name );
		System.out.println("============================");
		System.out.println("Medical Shop gst no is "+ gstNo);
		System.out.println("==============================");
		System.out.println("Medical Shop address is "+address);
		System.out.println("==============================");
		System.out.println("Medical shop noOfSections " +noOfSections);
		System.out.println("========================================");
		System.out.println("Medical Staff's Info");
		for(int i=0; i<staffNames.length; i++) {
			
			System.out.println(staffNames[i]);
			}
		System.out.println("=======================");
		System.out.println("Medical Staff's contactNo");
		for(int i=0; i< staffContactNo.length; i++) {
			System.out.println(staffContactNo[i]);
		}
		System.out.println("=========================");
		System.out.println("Medicalshop medicineNames");
		for(int i=0;i<medicineNames.length;i++) {
			System.out.println(medicineNames[i]);
			
		}
		
		System.out.println("===========================");
		System.out.println("Medical shop cosmetics");
		for(int i=0; i< cosmetics.length;i++) {
			System.out.println(cosmetics[i]);
		}
		
		System.out.println("==============================");
		System.out.println("Medical Shop billingMethods");
		for(int i=0;i<billingMethods.length;i++) {
			System.out.println(billingMethods[i]);
			
		}
		
		
		
	}
	
	

}
