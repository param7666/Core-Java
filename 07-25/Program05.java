
 // Write a java program to print Fibonacci Series.
//input :- 5
//output :-  0, 1, 1, 2, 3.


public class Program05 {
    public static void main(String[] args) {
        int n = 5;
        int  a=0;
        int b=1;
        for(int i=1;i<=n;i++) {
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
