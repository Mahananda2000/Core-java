class Cricket1{

       public static void main(String cricket[]){
  
             int rohitHighestScore = 264;//declare an array and initialization
             int sachinHighestScore = 200;
             int mandanaHighestScore = 135;
             int ackerrHighestScore = 232;
             int bjClarkHighestScore = 229;

             int highestScore[] ={rohitHighestScore,sachinHighestScore, mandanaHighestScore ,ackerrHighestScore ,bjClarkHighestScore };

             //variable returned from array element
             //int ref0 = highestScore[0];//array data always write in reference only
             //int ref1 = highestScore[1];
             //int ref2 = highestScore[2];
             //int ref3 = highestScore[3];
             //int ref4 = highestScore[4];
  
  
  
             
   
          //for loop
           for(int index = 0; index<highestScore.length; index++){
             int ref = highestScore[index];
           System.out.println("elements at index "+ index+ ref);
            }
 }
}
              