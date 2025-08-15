//Write a program to reverse a string.

public class RevNum {
    public static void main(String[]args) {
        int num=Integer.parseInt(args[0]);
        int rem;
        int rev=0;
        while(num!=0){
        rem=num%10;
        rev=rev*10+rem;
        num=num/10;
        }
        System.out.println("Reverse number is:"+rev);

    }
}
