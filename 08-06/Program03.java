public class Program03 {
    void checkValue(char value) {
        if(value>=65 && value<=90) {
            System.out.println("Your provided value is UPPERCASE CHARECTOR");
        } else if(value>=97 && value<=122) {
            System.out.println("Provided value is LOWERCASE CHARECTOR");
        } else if(value>=48 && value<=57) {
            System.out.println("Your provided value is NUMARIC VALUE");
        } else{
            System.out.println("FUCK YOU");
        }
    }
    public static void main(String[] args) {
        char value='D';
        Program03 obj=new Program03();
        obj.checkValue(value);
    }
}
