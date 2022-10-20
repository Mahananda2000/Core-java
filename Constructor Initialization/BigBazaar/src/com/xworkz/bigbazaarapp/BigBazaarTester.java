package com.xworkz.bigbazaarapp;

public class BigBazaarTester {
	 public static void main(String args[]){
		 
		  
		 
		 
		  BigBazaar ref = new BigBazaar();
		  ref.branch = "Jpnagar";
		  ref.gstNo = "AAAA505";
		  ref.noOfWorkers = 15;
		  System.out.println(ref.branch + " " + ref.gstNo + " " + ref.noOfWorkers);
		  //System.out.println(ref.branch);
		  BigBazaar big = ref;
		  System.out.println(big.branch + " " + big.gstNo + " " + big.noOfWorkers);
		  
		  
		 
		 }
		}

