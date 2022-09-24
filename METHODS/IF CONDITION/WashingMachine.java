class WashingMachine{

   static String brand;
   static String color;
   static double price; 
   static boolean isWash;

   public static boolean onOrOff(){
    System.out.println("inside onOrOff()");
	 if(isWash==false){
	      isWash=true;
	System.out.println("WashingMachine is turned on..");
	
	}
	 else if(isWash = true){
		isWash = false;
		System.out.println("WashingMachine is turned off");
	}
	System.out.println("end of onOrOff");
	return isWash;

	
 
 }   
   



}