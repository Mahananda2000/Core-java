class SpeakerTester{
   
   public static void main(String speaker[]){
   
    System.out.println("main method started");
	Speaker.brand ="boat";
	Speaker.color = "black";
    Speaker.price= 4000.00;
	
	Speaker.onOrOff();
	Speaker.increaseVolume();
	Speaker.increaseVolume();
	Speaker.increaseVolume();
	Speaker.decreaseVolume();
	Speaker.decreaseVolume();
	Speaker.onOrOff();
			
	System.out.println(Speaker.brand);
	System.out.println(Speaker.color);
	System.out.println(Speaker.price);
	
	System.out.println("main method ended");
   
   }



}