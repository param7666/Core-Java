//Automorphic number 

class Program01
{
	public static void main(String[] args) 
	{
		int num=25;
		int square=num*num;
		int rem,c=1;
		int m=num;
		System.out.println("Square of the "+num+" is "+square);
		
		while(num!=0)
		{
			c*=10;
			num/=10;
		}
		//System.out.println(c);
		rem=square%c;
		if (rem==m) System.out.println("The number is Automorphic Number");
		else System.out.println("The number is not a Automorphic");
		{
		}
	}
}
