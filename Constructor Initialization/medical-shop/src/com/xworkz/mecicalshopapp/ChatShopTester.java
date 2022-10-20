package com.xworkz.mecicalshopapp;

public class ChatShopTester {

	public static void main(String[] args) {
		String chatNames[]=new String[4];
		chatNames[0]="Noddles";
		chatNames[1]="Gobi";
		chatNames[2]="Panipuri";
		chatNames[3]="Bhelpuri";
		
		
	    int chatPrice[]=new int[4];
	    chatPrice[0]=60;
	    chatPrice[1]=50;
	    chatPrice[2]=20;
	    chatPrice[3]=30;
	    
	    
	    String softDrinks[]=new String[4];
	    softDrinks[0]="cocola";
	    softDrinks[1]="Maazaa";
	    softDrinks[2]="slice";
	    softDrinks[3]="Sprite";
	    
	    int noOfChats=10;
	    
	    ChatShop cs=new ChatShop("AS234","MAHALAXMI","RAJAJINAGAR",chatNames,chatPrice,softDrinks,noOfChats);
	    	
	    cs.displayInfo();
		}

}
