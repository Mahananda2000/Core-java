class User1{
     
     static boolean isAlive;//compile
     static long contactNo;
     static double price;
  //local,static,instance,parameter
      public static void main( String a[]){
      System.out.println("main started");
     //local
     System.out.println("variable before initialization");
     System.out.println("price");
     
     System.out.println("contactNo");
     System.out.println("isAlive"); 
//initialization of above declared variables
     
     isAlive = true;
     contactNo = 890808909L;
     price = 789.00;
     System.out.println("variables after initialization");
     
    System.out.println(price);
   
    System.out.println(contactNo);
    System.out.println(isAlive);
}
}
  
  
    