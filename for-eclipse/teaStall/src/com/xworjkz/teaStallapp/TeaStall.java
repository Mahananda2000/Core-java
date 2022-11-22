package com.xworjkz.teaStallapp;

public class TeaStall {
	
	public String name;
	public int teaStallId;
	public String ownerName;
	
	 {
		//block in java there is no usage 
		//two blocks 1)instance 2)static 
		//it can be created inside a class
	}
	
     public TeaStall() {//default
    	 
     }
     
     public TeaStall(String name,int teaStallId,String ownerName) {//parametrerised
    	 //wrt id,using this keyword is optional
    	 //wrt name,ownerName,
    	 //this keyword is to avoidnaming conflict between the parameter and instance variables 
    	 this.name=name;
    	 this.teaStallId=teaStallId;
    	 this.ownerName=ownerName;
    	 
    	 //invoking a displayinfo in a constructor using this keyword
    	 this.displayInfo();
    	 
     }
     public void displayInfo() {
    	 //invoking variables of a current class using this keyword
    	 System.out.println(this.name+" "+this.teaStallId+" "+this.ownerName );
    	 {
    		 
    	 }
     }
     

}
//this keyword can be declared inside method ,constructor inside,inside block
//public void =instance block
//public static = static block
//static variables used in a classname
//task block and this keyword

