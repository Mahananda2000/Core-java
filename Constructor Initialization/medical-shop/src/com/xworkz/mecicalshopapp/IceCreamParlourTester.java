package com.xworkz.mecicalshopapp;

public class IceCreamParlourTester {

	public static void main(String[] args) {
		String brandNames[]=new String[5];
		 brandNames[0]="Aruna";
		 brandNames[1]="Amula";
		 brandNames[2]="Vadilla";
		 brandNames[3]="Hangoes";
		 brandNames[4]="Baskin-Robbins";
		 
		 String typeOfIceCreams[]=new String[5];
		 typeOfIceCreams[0]="Cup";
		 typeOfIceCreams[1]="Cone";
		 typeOfIceCreams[2]="Candy";
		 typeOfIceCreams[3]="Chacobar";
		 typeOfIceCreams[4]="Kulfi";
		 
		 String iceCreamFlours[]=new String[5];
		 iceCreamFlours[0]="Straberry";
		 iceCreamFlours[1]="Venilla";
		 iceCreamFlours[2]="Pista";
		 iceCreamFlours[3]="Butterscoch";
		 iceCreamFlours[4]="Mango";
		 
		 int prices[]=new int[5];
		 prices[0]=10;
		 prices[1]=25;
		 prices[2]=30;
         prices[3]=20;
         prices[4]=12;
         
         IceCreamParlour ip = new IceCreamParlour("aq1234","Aruna IceCream","Mudhol",brandNames,typeOfIceCreams,iceCreamFlours,prices);
         
         ip.toEnjoy();
         

		 
		 
		 
		 
		 
		

	}

}
