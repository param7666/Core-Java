public class Program03 {
    public static void printChars(char start, char end, int n) {
        int charCount=0;
        for(char i=start; i<=end;i++) {
            System.out.print(i);
            charCount++;
            if(charCount==n){
                 System.out.println();
                 charCount=0;
            }
        }
                
    }
    public static void main(String[]args) {
        printChars('(','z',20);
    }
}
