class SunnyNumber 
{
	public static void main(String[] args) 
	{
		int num=80;
		int add=num+1;
		boolean flag=false;
		for(int i=1;i<=add;i++) {
			if((i*i)==add) {
				System.out.println("This is Sunny number");
				flag=true;
				break;
			}
		}
		if(flag!=true) {
			System.out.println("This is not a Sunny Number");
		}
		
	}
}
