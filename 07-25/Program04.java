//Write a Java program to print multiplication table from 2 to 5 by using for loop?
//input : 5.

public class Program04 {
  public static void main(String[]args) {
    int num=5;
    for(int i=2;i<=num;i++) {
        for(int j=1;j<=10;j++) {
            System.out.println(i+"*"+j+"="+i*j);
        }
        System.out.println();
    }
  }  
}
