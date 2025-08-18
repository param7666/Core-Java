//WAP to input a character and display its opposite case if its a letter otherwise
//display a message "Not a letter".

public class Program05 {
    void show(char value) {
        if(value>=65&&value<=90) {
            char result= (char) (value+32);
            System.out.println("Converted char: "+result);

        } else if(value>=97 && value<=122) {
            char result=(char) (value-32);
            System.out.println("Converted char:"+result);
        }
        else{
            System.out.println("Not a Latter");
        }
    }
    public static void main(String[]args) {
        char value='a';
        Program05 obj=new Program05();
        obj.show(value);
    }
}
