//Write a program to find the factorial of a number.

public class Factorial {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        int fact=1;
        for(int i=num;i>=1;i--) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
