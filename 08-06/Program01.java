import java.util.*;
public class Program01{
    public static void MinuteTOHour(int minute){
        int hour=minute/60;
        System.out.println("Hour:"+hour);
    }
    public static void hourToMinute(int hour) {
        int minute=hour*60;
        System.out.println("Minute:"+minute);
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter operation number");
        System.out.println("1)for hour");
        System.out.println("2)for Minute");
        int op=sc.nextInt();
        if(op==1) {
            System.out.println("Enter the minute");
            int minute=sc.nextInt();
            MinuteTOHour(minute);
        } else if(op==2) {
            System.out.println("Enter the Hour");
            int hour=sc.nextInt();
            hourToMinute(hour);
        } else{
            System.out.println("Invalid Operation !...");
        }
        sc.close();
    }
}