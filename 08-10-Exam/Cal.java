class Cal 
{
	public static void main(String[] args) 
	{
		
		char op='*';
		
		if(op=='+')
		{ 
			Calculator.add(10,20);
		}
		else if(op=='-')
		{ 
			Calculator.sub(10,20);
		}
		else if(op=='*')
		{ 
			Calculator.mul(10,20);
		}
		else if(op=='/')
		{
			Calculator.div(10,20);
		}
		else{
			System.out.println("Invalid Operation");
		}
	}
}
