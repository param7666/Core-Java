/*
 * Write a program to store a character, check and display whether it is a vowel or consonant.
 *  Display the character along with a suitable message.
 *  (Take a parameterized method which takes input of character and performs the above task)
 */

public class Program06 {
    void display(char value) {
        if((value=='A'||value=='a') && (value=='E'||value=='e') && (value=='I'||value=='i') && (value=='O'||value=='o') && (value=='U'||value=='u') ) {
            System.out.println("Entered carector is VOVEL !....");
        } else {
            System.out.println("Entered carector is CONSONANT !.....");
        }
    }
    public static void main(String [] args) {
        char value='A';
        Program06 obj=new Program06();
        obj.display(value);

    }
}
