class NcrTester
{   
    public static void main(String args[])
	{
	int num=5;
	int	r = 2;
	int finalValue= Factorial.fact(num)/(Factorial.fact(num-r)*Factorial.fact(r));
	
	System.out.println(finalValue);
	}
}