class Showroom{

    static void getCars(String[] cars){
		System.out.println("inside getcars()");
		System.out.println("size of cars is "+ cars.length);
		System.out.println("list of cars are ");
		 for(int index=0; index<cars.length; index++){
		  System.out.println(cars[index]);
		 }
		 System.out.println("end of getcars() ");	
	}
	
	
	static void getBikes(String[] bikes){
		System.out.println("inside getBikes()");
		System.out.println("size of bikes is " + bikes.length);
		System.out.println("list of bikes are");
		for(int index=0;index<bikes.length;index++){
		 System.out.println(bikes[index]);
	}
	    System.out.println("end of getBikes()");
    }
	
	
	static void getVechiclesNo(String[] vechiclesNo){
		System.out.println("inside getVechiclesNo()");
		System.out.println("size of VechiclesNo is "+ vechiclesNo.length);
		System.out.println("list of VechiclesNo are");
		for(int index=0;index<vechiclesNo.length;index++){
		 System.out.println(vechiclesNo[index]);
	
	}
	    System.out.println("end of getVechiclesNo()");
	}



}