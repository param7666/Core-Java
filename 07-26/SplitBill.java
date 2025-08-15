//java program to slipt biil

public class SplitBill {

    public static void main(String [] args) {
        int peple=Integer.parseInt(args[0]);
        int bill=Integer.parseInt(args[1]);
        int total=bill/peple;
        System.out.println("The total bill per persion is "+total);


    }
}