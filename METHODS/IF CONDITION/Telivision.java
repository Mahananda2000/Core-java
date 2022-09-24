class Telivision{

   static String brand;
   static String color;
   static double price; 
   static boolean isEntertainment;

   public static boolean yesOrNo(){
    System.out.println("inside yesOrNo()");
	if(isEntertainment==false){
	      isEntertainment=true;
	System.out.println("yes telivision is gives entertainment");
	
	}
	else if(isEntertainment = true){
		isEntertainment = false;
		System.out.println("no telivision is gives entertainment");
	}
	System.out.println("end of yesOrNo");
	return isEntertainment;

	
 
 }   
   



}