package com.xworkz.mecicalshopapp;

public class ChatShop {

	
		
		public String gstNo;
		public String name;
		public String address;
		public String chatNames[];
		public int chatPrice[];
		public String softDrinks[];
		public int noOfChats;
		//default constructor
		public ChatShop() {
			
		}
		//parameterized constructor
		/*public ChatShop(String gstNo,String name,String address,String chatNames[],int chatPrice[],String softDrinks[],int noOfChats) {
			
			System.out.println("ChatShop Object is Created");
			this.gstNo=gstNo;
			this.name=name;
			this.address=address;
			this.chatNames=chatNames;
			this.chatPrice=chatPrice;
			this.softDrinks=softDrinks;
			this.noOfChats=noOfChats;
			
	}*/
		public void displayInfo() {
			System.out.println("chatShop name is"+ name);
			System.out.println("=======================");
			System.out.println("chatshop gstNo is"+gstNo);
			System.out.println("========================");
			System.out.println("chatshop address is"+ address);
			System.out.println("==========================");
			System.out.println("chatshop information details");
			for(int i=0; i<chatNames.length;i++) {
				System.out.println(chatNames[i]);
				
			}
			System.out.println("================");
			for(int i=0;i<chatPrice.length;i++) {
				System.out.println(chatPrice[i]);
			}
			System.out.println("===================");
			for(int i=0;i<softDrinks.length;i++) {
				System.out.println(softDrinks[i]);
			}
			}

}
