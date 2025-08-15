/*
Q13. Write the program in Java to display the following pattern:
9
9 7
9 7 5
9 7 5 3
9 7 5 3 1
*/

class Pattern13 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++) {
			int num=9;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num-=2;
			}
			System.out.println();
		}
	}
}
