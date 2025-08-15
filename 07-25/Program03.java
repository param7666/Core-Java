/*
 * 1. Write a Java program to find prime  number upto given number   by using for loop?
input : n = 10.
output :- 2,3,5,7.

 */

public class Program03 {
    public static void main(String[] args){
        int n=10;
        
        for(int i=2;i<=n;i++) {
            int count=0;
            for(int j=1;j<=i;j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2) System.out.println(i+" ");
        }
    }
}
