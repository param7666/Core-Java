public class Fibonnaci {
    public static void main(String[]args) {
        int num=Integer.parseInt(args[0]);
        int num1=0;
        int num2=1;
        for(int i=1;i<=num;i++) {
           
            System.out.println(num1);
            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }
}
