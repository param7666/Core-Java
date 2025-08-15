// Write a java program to count the number of digit and it's sum of the given number . 
//input 12345
//output 
//no. of digit = 5.
//sum of digit = 15.


public class Program06 {
    public static void main(String[] args) {
        int num=12345;
        int c=0;
        int rem;
        int sum=0;
        while(num!=0) {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
            c++;
        }
        System.out.println("Number of digit is = "+c);
        System.out.println("Sum of thej digit = "+sum);
    }
}
