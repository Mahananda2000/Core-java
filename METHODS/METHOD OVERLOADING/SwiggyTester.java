class SwiggyTester{
  public static void main(String a[]){
  //invoking method
  double itemPrice = Swiggy.takeOrder("Mosaranna");
  System.out.println("The item price is "+ itemPrice);
  double itemPriceWithQuantity=Swiggy.takeOrder("Mosaranna",67);
  System.out.println("The item quantity is is "+ itemPriceWithQuantity );
  System.out.println("Your final is ready....Enjoy");
  
  
  }




}