package com.xworkz.mecicalshopapp;

public class MilkParlourTester {

	public static void main(String[] args) {
		
			String milkProducts[]=new String[5];
			milkProducts[0]="Chacolates";
			milkProducts[1]="Luccy";
			milkProducts[2]="Curd";
			milkProducts[3]="Cakes";
			milkProducts[4]="Peda";
			
			int prices[]=new int[5];
			prices[0]=25;
			prices[1]=20;
			prices[2]=15;
			prices[3]=45;
			prices[4]=60;

			String brandNames[]=new String[4];
			brandNames[0]="Arogya";
			brandNames[1]="subham";
			brandNames[2]="Nandini";
			brandNames[3]="GoodLife";
			
			int noOfProducts=8;
			
			MilkParlour mk=new MilkParlour("Awer567","Aruna Parlour","bagalkot",milkProducts,prices,brandNames,noOfProducts);
			
			
			mk.displayInfo();
			
			
			


		}

	


	}


