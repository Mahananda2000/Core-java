class Speaker{

   static String brand;
   static String color;
   static double price; 
   static boolean isConnected;
   static int minVolume;
   static int maxVolume=8;
   static int currentVolume;


   public static boolean onOrOff(){
    System.out.println("inside onOrOff()");
	if(isConnected==false){
	      isConnected=true;
	System.out.println("speaker is turned on..");
	
	}
	else if(isConnected == true){
		isConnected = false;
		System.out.println("speaker is turned off");
	}
	System.out.println("end of onOrOff");
	return isConnected;
 }
      public static void increaseVolume(){
      System.out.println("inside increaseVolume()");
	  //false == true 
      if(isConnected == true){
      if(currentVolume<maxVolume){
         currentVolume = currentVolume+1;
		 
     System.out.println("the currentvolume is  :" + currentVolume);
      }
       else{
         System.out.println("max volume reached...");
       }
	  }
	   else{
		   System.out.println("first speaker on madu");
	   }
	  
	  System.out.println("out of increaseVolume()");
	 }
	 
	  public static void decreaseVolume(){
		  System.out.println("inside decreaseVolume()");
		  if(isConnected == true){
		  if(currentVolume>minVolume){
			  currentVolume = currentVolume-1;
			  
		  System.out.println("the currentVolume is :" + currentVolume);
		  }
       else{
	     System.out.println("min volume reached..");
		  	  
		  }
	  }
	  
	   else{
		   
	   System.out.println("gube ...first speaker on madu");
	   }
	  
   System.out.println("end of decreaseVolume()");

   }
  

 
}   
   
