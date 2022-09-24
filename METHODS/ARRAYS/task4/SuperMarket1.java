//USING FOR LOOP
class SuperMarket1{
   static String superMarketName = "Reliance Mart";
   public static void main( String a[]){
   System.out.println("Welcome to "+ superMarketName);

   String  vegetables[] = {"Lady's Finger","Tomato","Heere Kai","CauliFlower","onion","chilly","brinjal"};

   String  perFumes[] = {"SweetHeart","Fogg","Something Something","spinz","Yardley","What a Girl"};

   String  fruits[] = {"Pinaple","Apple","Banana","Straberry","Mango","Watermelon","Lemon","Orange","Grapes","Black Berry"};

   String  biscuits[] = {"Orio","Bounce","Parle-g","Crackchack","GoodDay","Hideandsick","Marei-Gold","Barbun","Googly","Anmol"};

   String  chacolates[]={"Bubbly","Perk","Kitkat","Amuil","Much","Milkybar","lotus","Fuse","Bournville","eclairs"};

   String shoes[] = {"Sneakers","Boots","Clogs","Crocs","Earth Shoes","Flip-flop","Galoshes","Huaraches","Moccasins","Bata"};

   String groceries[] = {"Soda","Cereal","Frozen Dinners","Salty Snacks","Milk","Laundary Detergents","Eggs","Peanuts"," Butter","Jelly"};

   String electronicDevices[] = {"Smartwatches","Clock","Television","Mouse","Printer","Scanner","Camera","Laptop","Power Bank","Airphone"};

   String cosmetics[] = {"Face-powder","Lip Liner","Lip Pencil","Mascara","Eyeliner","Lipstick","Lotion","Brightner","Nail Polish","Soap"};

   String clothes [] = {"T-shirts","Sweater","Jacket","Coat","Jeans","Socks","Shorts","Tracksuits","Raincoats","leggins"};

   String meats[] = {"Chicken","Pork","Beef","Lamb","mutton","turkey","Venison","Goat meat","Duck","Buffallo"};

   String bags[] = {"Hand Bag","Hobo bag","Tote bag","Duffle bag","Messenger bag","Backpack","Satchel","Side bag","Rolling bag","college bag"};
     

      System.out.println("perFumes section");
      System.out.println("***********************************************");
      for(int z = 0; z<perFumes.length;z++){
        System.out.println(perFumes[z] + " ");
       }

      System.out.println("vegetables section");
      System.out.println("***********************************************");
      for(int v = 0; v<vegetables.length;v++){
        System.out.println(vegetables[v] + " ");
       }

      System.out.println("fruits section");
      System.out.println("***********************************************");
      for(int z = 0; z<fruits.length;z++){
        System.out.println(fruits[z] + " ");
        }

      System.out.println("biscuits section");
      System.out.println("***********************************************");
      for(int z = 0; z<biscuits.length;z++){
        System.out.println(biscuits[z] + " ");
        }

      System.out.println("chacolates section");
      System.out.println("***********************************************");
      for(int z = 0; z<chacolates.length;z++){
        System.out.println(chacolates[z] + " ");
       }

      System.out.println("shoes section");
      System.out.println("***********************************************");
      for(int z = 0; z<shoes.length;z++){
        System.out.println(shoes[z] + " ");
       }

      System.out.println("groceries section");
      System.out.println("***********************************************");
      for(int z = 0; z<groceries.length;z++){
        System.out.println(groceries[z] + " ");
       }

      System.out.println("electronicDevices section");
      System.out.println("***********************************************");
      for(int z = 0; z<electronicDevices.length;z++){
        System.out.println(electronicDevices[z] + " ");
        }

       System.out.println("cosmetics section");
       System.out.println("***********************************************");
       for(int z = 0; z<cosmetics.length;z++){
          System.out.println(cosmetics[z] + " ");  
        }

      System.out.println("clothes section");
      System.out.println("***********************************************");
      for(int z = 0; z<clothes.length;z++){
         System.out.println(clothes[z] + " ");
       }

      System.out.println("meats section");
      System.out.println("***********************************************");
      for(int z = 0; z<meats.length;z++){
         System.out.println(meats[z] + " ");
       }

        System.out.println("bags section");
        System.out.println("***********************************************");
        for(int z = 0; z<bags.length;z++){
        System.out.println(bags[z] + " ");
      }

   }
        
}