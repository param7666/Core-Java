
	public class Sample01 {
	
	public void m1() {
		 System.out.println("HELLO NON STATIC METHOD");
	}
	public int m2() {
		 Sample01 s=new Sample01();
		 s.m1();
		 return 10;
	}
	
public static void main(String[] args) {
	Sample01 s=new Sample01();
	int result=s.m2();
	System.out.println(result);
	
	
}
}

