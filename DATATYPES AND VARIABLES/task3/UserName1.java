class UserName1{

	static String userName;
	static boolean 	isAlive;
	static long contactNo;
        
	   static double	price = 233.0 ;
            static char ch = 'E';
	
	
	// local variables, static variables , instance variables, parameter variables
	
	public static void main(String a[]){
		System.out.println("Main started");
		//local variables
		
		
	    System.out.println("variables before initialization ");
		System.out.println(userName);
		System.out.println(contactNo);
		System.out.println(price);
		System.out.println(isAlive);
		System.out.println(ch);
		
		userName = "manu";
		isAlive = true;
		contactNo = 2147483647L;
		price = 7546.50;
		ch = 'e';
		
		System.out.println("variables after initialization ");
		System.out.println(userName);
		System.out.println(contactNo);
		System.out.println(price);
		System.out.println(isAlive);
		System.out.println(ch);
		System.out.println("Main ended");
		}
}