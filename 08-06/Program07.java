/*
 * Write a program to store an integer, check and display whether it is positive, negative, or zero.
 *  Display the integer along with a suitable message.
 *  (Take a parameterized method which takes input of integer and performs the above task)
 */

public class Program07 {
    void display(int value) {
        if(value==0) {
            System.out.println("Value is ZERO !...");
        } else if(value>0) {
            System.out.println("Value is POSITIVE !....");
        } else {
            System.out.println("Value is NEGETIVE !....");
        }
    }
    public static void main(String[] args) {
        int value=5;
        Program07 obj=new Program07();
        obj.display(value);
    }
}
