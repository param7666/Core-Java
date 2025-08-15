//Write a program to find the sum of digits of a number.

public class SumOfDigit {
    public static void main(String[]args) {
        int num=Integer.parseInt(args[0]);
        int sum=0,rem;
        while(num!=0) {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of digit is"+sum);
    }
}
