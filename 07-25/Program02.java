//Palindrome number
//Write a program to generate and display the palindrome number
public class Program02 {
    public static void main(String[]args){
        
        for(int i=10;i<=1000;i++) {
            int temp=i;
            int rev=0;
            int rem;
            while(temp!=0) {
                rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(rev==i) System.out.println(i+" ");
        }
        
    }
}
