class Speaker {
   
     static String brand;
     static String modelName;
     static String colour;
     static String type; 
     static int cost;
   
     public static void main(String a[]){
    
     System.out.println(brand);
     System.out.println(modelName);
     System.out.println(colour);
     System.out.println(type);
     System.out.println(cost);
  

     brand = "EDUPLINK";
     modelName = "M6PRO";
     colour = "black";
     type = "outdoor"; 
     cost = 500;

     System.out.println("Speaker brand is " + brand);
     System.out.println("Speaker modelName is " + modelName);
     System.out.println("Speaker colour is " + colour);
     System.out.println("Speaker type is " + type);
     System.out.println("Speaker cost is " + cost);
  
  }
}