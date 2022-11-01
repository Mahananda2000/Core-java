package com.xworkz.overloading;

public class CarramBoardTester {

	public static void main(String[] args) {
		String brandNames[]= {"SISCAA","SURCO","PRECISE","SYNCO","GSI"};
        CarramBoard cb=new CarramBoard(brandNames);
            //System.out.println(cb.id + " "+ cb.name);
              cb.displayDetails();


	}

}
