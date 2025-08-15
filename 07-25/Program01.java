//Fibonacci Series 
//Write a program to generate and display the fibonacci series up to a specified number.

class program01{
    public static void main(String []args) {
        int a=0,b=1;
        int c;
        System.out.println("Fibonacci Series:");
        for(int i=1;i<=20;i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}