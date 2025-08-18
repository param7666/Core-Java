public class Sample04 {
    public boolean m1(int number1,int number2) {
         return (number1==number2);
    }
    public void m2(int number1,int number2) {
         if(m1(number1,number2)) {
             System.out.println("SAME");
         }
         else {
             System.out.println("dIFF");
         }
    }
   public static void main(String args[])
   {
   Sample04 obj=new Sample04();
   System.out.println(obj.m2(10, 10));
   
   
   }

}
