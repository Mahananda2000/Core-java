class Mobile{

   static String brand;
   static String color;
   static double price; 
   static boolean isInternet;

   public static boolean onOrOff(){
    System.out.println("inside onOrOff()");
	if(isInternet==false){
	      isInternet=true;
	System.out.println("Mobile is turned on..");
	
	}
	if(isInternet == true){
		isInternet = false;
		System.out.println("Mobile is turned off");
	}
	System.out.println("end of onOrOff");
	return isInternet;

	
 
 }   
   



}
