package com.xworkz.mecicalshopapp;

public class ChatShopTester {

	public static void main(String[] args) {
		//default constructor
		ChatShop cs=new ChatShop();
		cs.gstNo="qe12345";
		cs.name="MAHALAXMI";
		cs.address="RAJAJINAGAR";
		
		
		cs.chatNames=new String[4];
		cs.chatNames[0]="Noddles";
		cs.chatNames[1]="Gobi";
		cs.chatNames[2]="Panipuri";
		cs.chatNames[3]="Bhelpuri";
		
		
	    cs.chatPrice=new int[4];
	    cs.chatPrice[0]=60;
	    cs.chatPrice[1]=50;
	    cs.chatPrice[2]=20;
	    cs.chatPrice[3]=30;
	    
	    
	    cs.softDrinks=new String[4];
	    cs.softDrinks[0]="cocola";
	    cs.softDrinks[1]="Maazaa";
	    cs.softDrinks[2]="slice";
	    cs.softDrinks[3]="Sprite";
	    
	    int noOfChats=10;
	    
		
		
		//parameterised constructor
		/*String chatNames[]=new String[4];
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
	    
	    int noOfChats=10;*/
	    
	    //ChatShop cs=new ChatShop("AS234","MAHALAXMI","RAJAJINAGAR",chatNames,chatPrice,softDrinks,noOfChats);
	    	
	    cs.displayInfo();
		}

}
