class Swiggy{

//pizza,burger,sandwitch,frenchfries,sounthindia,pastries
public static double takeOrder(String item,int quantity){
if(item=="Pizza"){
System.out.println("Thank you for ordering "+ item);
   return 99.00 *quantity;
}
if(item=="Burger"){
System.out.println("Thank you for ordering "+ item);
   return 60.00  *quantity;
}
if(item=="SouthIndian"){
System.out.println("Thank you for ordering "+ item);
return 135.00  *quantity;
}
if(item=="Mosaranna"){
System.out.println("Thank you for ordering "+ item);
return 25.00  *quantity;
}
if(item=="Sandwitch"){
System.out.println("Thank you for ordering "+ item);
return 45.00  *quantity;
}
if(item=="Pastries"){
System.out.println("Thank you for ordering "+ item);
return 50.00  *quantity;
}
return 0.0;

}


}