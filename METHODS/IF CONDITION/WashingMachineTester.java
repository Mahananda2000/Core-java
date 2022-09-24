class WashingMachineTester{
   
   public static void main(String machine[]){
   
    System.out.println("main method started");
	WashingMachine.brand ="boat";
	WashingMachine.color = "black";
    WashingMachine.price = 4000.00;
	WashingMachine.onOrOff();
		WashingMachine.onOrOff();
			WashingMachine.onOrOff();
	
	System.out.println(WashingMachine.brand);
	System.out.println(WashingMachine.color);
	System.out.println(WashingMachine.price);
	
	System.out.println("main method ended");
   
   }



}