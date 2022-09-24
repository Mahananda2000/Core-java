class WashingMachineTester{
   
   public static void main(String a[]){
   
    System.out.println("main method started");
	WashingMachine.brand ="samsung";
	WashingMachine.color = "purple";
    WashingMachine.price= 18000.00;
	WashingMachine.onOrOff();
		WashingMachine.onOrOff();
			WashingMachine.onOrOff();
	
	System.out.println(WashingMachine.brand);
	System.out.println(WashingMachine.color);
	System.out.println(WashingMachine.price);
	
	System.out.println("main method ended");
   
   }



}