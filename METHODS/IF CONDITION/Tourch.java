class Tourch{

   static String brand;
   static String color;
   static double price; 
   static boolean isLight;

   public static boolean onOrOff(){
    System.out.println("inside onOrOff()");
	if(isLight==false){
	      isLight=true;
	System.out.println("Tourch is turned on..");
	
	}
	if(isLight == true){
		isLight= false;
		System.out.println("Tourch is turned off");
	}
	System.out.println("end of onOrOff");
	return isLight;

	
 
 }   
   



}
