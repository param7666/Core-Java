public class Program02 {

    public static void giveValues() {
       String name="Param Gurlewad";
       double basicPay=35500;
       double conveAllow=5000;
        salaryCalculate(name, basicPay, conveAllow);
    }
    public static void salaryCalculate( String name, double basicPay, double conveAllow) {
        double specialAllow=(basicPay*0.25)/100;
        double gross=basicPay+specialAllow+conveAllow;
        double pf=(basicPay*8.33)/100;
        double netSalary=gross-pf;
        double anualSAlary=400000;
        dispayDitails(name, basicPay, conveAllow, specialAllow, gross, pf, netSalary, anualSAlary);
    }
    public static void dispayDitails(String name, double basicPay, double conveAllow, double specialAllow, double gross, double pf, double netSalary, double anualSAlary) {
        System.out.println("Name:"+name);
        System.out.println("Basic Pay:"+basicPay);
        System.out.println("Conveyance Allowance:"+conveAllow);
        System.out.println("Special Allowance:"+specialAllow);
        System.out.println("Gross Salary:"+gross);
        System.out.println("PF:"+pf);
        System.out.println("Net Salary:"+netSalary);
        System.out.println("Anual Salary:"+anualSAlary);
    }
    public static void main(String[] args) {
        giveValues();
    }
}
