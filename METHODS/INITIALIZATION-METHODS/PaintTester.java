class PaintTester{
 public static void main(String args[]){
 
    Paint.setPaintId(123);
	Paint.setBrandName("Nerolac");
	Paint.setColor("Pink");
	
	System.out.println(Paint.getPaintId());
	System.out.println(Paint.getBrandName());
	System.out.println(Paint.getColor());
 
 }

}