
public class Sample03 {
	public boolean m1(int number) {
		 if(number%2==0) {
			return true;
		 }
		 else {
			  return false;
		 }
	}
	public void m2(int number) {
         Sample03 s=new Sample03();
	 boolean result= s.m1(number);
	 if(result) {
		  System.out.println("Even");
	 }
	 else {
		  System.out.println("Odd");
	 }
	}
	public static void main(String args[])
	{
	Sample03 obj=new Sample03();
	obj.m2(10);
	
	}

}