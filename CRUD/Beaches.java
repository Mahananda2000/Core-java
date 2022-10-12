class Beaches{
	//static String beachNames[]={"marina",null,null,null,null};
     static String beachNames[]={null,null,null,null,null};
     static int index;

//saveBeach,storeBeachNames
    //beachName = "marina";
	//beachName[1] = "malpe";
    public static boolean addBeachNames(String beachName){
	System.out.println("inside addBeachNames");
	//beachNames[0] = "marina";
	//beachNames[1] = "malpe";
	//beachNames[2] = "baga";
	//beachNames[3] = "gokarna";
	//beachNames[4] = "muradeswhar";
	 if(beachNames.length<=5 && beachName != null && beachName != ""){
		 
	   beachNames[index++]=beachName;  //more than given length we have to use the if condition statementds=overloaded
	   //index++;
	   return true;
	 }
	   else{
		   System.out.println("Beach Names overload");
	   }
	System.out.println("end of addBeachNames");
	return false;//return false;
}

//read operation


public static void getBeachNames(){
for(int index=0;index<beachNames.length;index++){
String ref = beachNames[index];
System.out.println("Beach name is" + ref);
}

}
public static void findBeachName(String beachName){
System.out.println("inside findBeachName");
for(int index=0;index<beachNames.length;index++){
 if(beachName != null && beachNames[index] == beachName){
	 String ref = beachNames[index];
	 System.out.println("beach name is" + ref);
  }
  else{
	  System.out.println("no beach name found.. munde hogi");
  }
}

System.out.println("end of findBeachName");
		
	}
}
//task
//AirportInIndia
//Banks
//TouristPlaces=7
//Stadiums
