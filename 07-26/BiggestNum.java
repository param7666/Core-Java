import java.util.*;
public class BiggestNum {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=inp.nextInt();
        System.out.println("Enter the second number");
        int num2=inp.nextInt();
        if(num1<num2) System.out.println(num2+" is Greter");
        else System.out.println(num1+" is grether");
    }
}
