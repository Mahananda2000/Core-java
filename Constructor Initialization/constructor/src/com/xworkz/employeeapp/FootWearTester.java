package com.xworkz.employeeapp;

public class FootWearTester {
	public static void main(String args[]) {
		 FootWear ftw = new FootWear("id1","pink",100,"lunars",4,"sandal");
		 System.out.println("FootWare Details");
		 System.out.println(ftw.footWareId + " "+ ftw.color +" "+ ftw.price + " "+ftw.brandName + " "+ftw.size + " "+ftw.model);
		 
		 FootWear ftw1 = new FootWear("id2","black",4000,"bata",5,"hills");
		 System.out.println("FootWare Details");
		 System.out.println(ftw1.footWareId + " "+ ftw1.color +" "+ ftw1.price + " "+ftw1.brandName + " "+ftw1.size + " "+ftw1.model);
		 
		 FootWear ftw2 = new FootWear("id3","brown",600,"walkmate",6,"flat");
		 System.out.println("FootWare Details");
		 System.out.println(ftw2.footWareId + " "+ ftw2.color +" "+ ftw2.price + " "+ftw2.brandName + " "+ftw2.size + " "+ftw2.model);
		 
	}
}



