public class Sample02 {
	public void m1() {
		 System.out.println("HELLO NON STATIC METHOD");
	}
	public int m2() {
		 m1();
		 return 10;
	}
	public int m3() {
		 int result=m2();
		 return result*result;
	}
	
public static void main(String[] args) {
	Sample04 s=new Sample04();
	int result=s.m2();
	System.out.println(result);
	
	
}
}