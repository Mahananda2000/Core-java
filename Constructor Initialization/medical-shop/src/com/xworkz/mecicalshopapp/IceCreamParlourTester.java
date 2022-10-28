package com.xworkz.mecicalshopapp;

public class IceCreamParlourTester {

	public static void main(String[] args) {
		
		IceCreamParlour ip=new IceCreamParlour();
		ip.gstNo="aq1234";
		ip.name="Aruna IceCream";
		ip.address="Mudhol";
		
		ip.brandNames=new String[5];
		 ip.brandNames[0]="Aruna";
		ip. brandNames[1]="Amula";
		 ip.brandNames[2]="Vadilla";
		 ip.brandNames[3]="Hangoes";
		 ip.brandNames[4]="Baskin-Robbins";
		 
		 ip.typeOfIceCreams=new String[5];
		 ip.typeOfIceCreams[0]="Cup";
		 ip.typeOfIceCreams[1]="Cone";
		 ip.typeOfIceCreams[2]="Candy";
		 ip.typeOfIceCreams[3]="Chacobar";
		 ip.typeOfIceCreams[4]="Kulfi";
		 
		 ip.iceCreamFlours=new String[5];
		 ip.iceCreamFlours[0]="Straberry";
		 ip.iceCreamFlours[1]="Venilla";
		 ip.iceCreamFlours[2]="Pista";
		 ip.iceCreamFlours[3]="Butterscoch";
		 ip.iceCreamFlours[4]="Mango";
		 
		 ip.prices=new int[5];
		ip. prices[0]=10;
		 ip.prices[1]=25;
		 ip.prices[2]=30;
        ip. prices[3]=20;
         ip.prices[4]=20;
		
		
		/*String brandNames[]=new String[5];
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
         prices[4]=20;*/
         //parameterised constructor
         //IceCreamParlour ip = new IceCreamParlour("aq1234","Aruna IceCream","Mudhol",brandNames,typeOfIceCreams,iceCreamFlours,prices);
         
         ip.toEnjoy();
         

		 
		 
		 
		 
		 
		

	}

}
