class AirConditioner{
        
   static String brand;
   static String colour;
   static double price;
   static boolean isCooled;

    public static boolean yesOrNo(){
    System.out.println("inside yesOrNo()");
	if(isCooled==false){
	      isCooled=true;
	System.out.println("yes AirConditioner is cooled");
	
	}
	else if(isCooled = true){
		isCooled = false;
		System.out.println("no AirConditioner is cooled");
	}
	System.out.println("end of yesOrNo");
	return isCooled;

	
 
 }   
   



}
  
  
  
  
    





}