package com.xworkz.mecicalshopapp;

import com.xworkz.mecicalshopapp.medical.MedicalShop;

public class MedicalShopTester {

	public static void main(String[] args) {
		
		 String staffNames[]=new String[5];
	     staffNames[0]="Naranga";
		 staffNames[1]="Mahananda";
         staffNames[2]="Akshata";
         staffNames[3]="Madhu";
         staffNames[4]="Veena";
         
          long staffContactNo[] = new long[5];
           staffContactNo[0]=6362101683L;
           staffContactNo[1]=63621056683L;
           staffContactNo[2]=634567683L;
           staffContactNo[3]=634567683L;
           staffContactNo[4]=634567683L;
           
           String medicineNames[] = new String[5];
           medicineNames[0] = "Dolo 650";
           medicineNames[1] = "B-Complex";
           medicineNames[2] = "Paracetemal";
           medicineNames[3] = "Sipla";
           medicineNames[4] = "Sumo";
           
           String cosmetics[] = new String[5];
           cosmetics[0] = "Soap";
           cosmetics[1] = "Shampoo";
           cosmetics[2] = "Creams";
           cosmetics[3] = "Poweder";
           cosmetics[4] = "Serum";
           
           int noOfSections=5;
           
           
           String billingMethods[] = new String[4];
           billingMethods[0]="Phonepay";
           billingMethods[1]="Googlepay";
           billingMethods[2]="Amazonpay";
           billingMethods[3]="Paytm";
           
          
           
           
           


		
		MedicalShop med = new MedicalShop("AAERT678906789","vijayanagar","maha",staffNames,staffContactNo,medicineNames,cosmetics,noOfSections,billingMethods);
		
		
		
		
		/*med.gstNo="AAERT678906789";
		med.address="vijayanagar";
		med.name="maha";
		
		
		med.staffNames=new String[5];
		med.staffNames[0]="Naranga";
		med.staffNames[1]="Mahananda";
        med.staffNames[2]="Akshata";
        med.staffNames[3]="Madhu";
        med.staffNames[4]="Veena";
        //med.staffNames[5]="Shilpa";it is out of bounds*/
        
       /* med.staffContactNo = new long[5];
        med.staffContactNo[0]=6362101683L;
        med.staffContactNo[1]=63621056683L;
        med.staffContactNo[2]=634567683L;
        med.staffContactNo[3]=634567683L;
        med.staffContactNo[4]=634567683L;*/

     /*   
        med.medicineNames = new String[5];
        med.medicineNames[0] = "Dolo 650";
        med.medicineNames[1] = "B-Complex";
        med.medicineNames[2] = "Paracetemal";
        med.medicineNames[3] = "Sipla";
        med.medicineNames[4] = "Sumo";*/


       /* med.cosmetics = new String[5];
        med.cosmetics[0] = "Soap";
        med.cosmetics[1] = "Shampoo";
        med.cosmetics[2] = "Creams";
        med.cosmetics[3] = "Poweder";
        med.cosmetics[4] = "Serum";*/
        
       /* med.noOfSections= 5 ;
        
        med.billingMethods = new String[4];
        med.billingMethods[0]="Phonepay";
        med.billingMethods[1]="Googlepay";
        med.billingMethods[2]="Amazonpay";
        med.billingMethods[3]="Paytm";*/
        
        
        med.displayInfo();
        
     

	}

}
