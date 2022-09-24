class Forest{
  
       public static void main(String a[]){
  
             String forestName = "Bandipur forest";        //declare an array and initialization
             String forestTotalArea = "4.5 km million";
             String  forestType = "Dense moist tropical forest";
             String  forestRegion ="Bandipur";
 
            String primaryAnimals[] = {"jaguar","tiger","lion","deer","elephant"};

            String forestFeatures[] = {forestName,forestTotalArea,forestType,forestRegion};

            
             String ref0 = forestFeatures[0];
             String ref1 = forestFeatures[1];
             String ref2 = forestFeatures[2];
             String ref3 = forestFeatures[3];
    
             System.out.println("forest Name" +ref0);
             System.out.println("forest TotalArea" +ref1);
             System.out.println("forest Type" +ref2);
             System.out.println("forest Region" +ref3);
 

           for(int y = 0; y < primaryAnimals.length; y++){
            System.out.println("elements at index "+primaryAnimals[y]+" ");
            }
   
     
             
       
 }
}
              
        


        





   
  
 