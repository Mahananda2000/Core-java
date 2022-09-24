class KeyBoard{
    
      static String brand;
      static String compatibleDevices;
      static String connectivityTechnology="USB";
      static String description="gaming";
    
      public static void main(String b[]){
      
      System.out.println(brand);
      System.out.println(compatibleDevices);
      System.out.println(connectivityTechnology);
      System.out.println(description);

      brand="Fiodio";
      compatibleDevices="PC";
      connectivityTechnology="USB";
      description="gaming";
    

      System.out.println(" Brand is " + brand);
      System.out .println(" compatibleDevices is " + compatibleDevices );
      System.out.println(" connectivityTechnology is " + connectivityTechnology);
      System.out.println(" Description is " + description);
      }
}