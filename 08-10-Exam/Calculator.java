class Calculator
{
	public static void add(double num1, double num2)
	{
		double result = (num1 + num2);
		System.out.println("Addition Is:"+result);
	}
	
	public static void sub(double num1, double num2)
	{
		double result=num1-num2;
		System.out.println("Substartion is:"+result);
	}
	
	public static void mul(double num1, double num2)
	{
		double result=num1*num2;
		System.out.println("Multification is"+result);
	}
	
	public static void div(double num1, double num2)
	{
		double result=num1/num2;
		System.out.println("Division is"+result);
	}
}
