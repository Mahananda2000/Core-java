class Bluetooth {
      static String brand;
      static String modelName;
      static String diameter;
      static String speakerType;
      static int cost;
   
     public static void main(String a[]){

     System.out.println(brand);
     System.out.println(modelName);
     System.out.println(diameter);
     System.out.println(speakerType);
     System.out.println(cost);

     brand = "Axess";
     modelName = "spb1031bl";
     diameter = "3 inches";
     speakerType = "subwofar";
     cost = 1500;

     System.out.println("Bluetooth brand is " + brand);
     System.out.println("Bluetooth modelName is " + modelName);
     System.out.println("Bluetooth diameter is " + diameter);
     System.out.println("Bluetooth speakerType is " + speakerType);
     System.out.println("Bluetooth cost is " + cost);
  
  }
}