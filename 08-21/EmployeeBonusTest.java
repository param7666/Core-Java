
 class Employee {
    private String empName;
    private double basicSalary;
    private int performanceRating;

    public Employee() {
        //defualt constructor
    }

    public void setEmpName(String name){
        this.empName=name;
    }
    public void setBasicSalary(double salary) {
        this.basicSalary=salary;
    }
    public void setPerformanceRating(int rating) {
        this.performanceRating=rating;
    }
    public String getEmpName() {
        return empName;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public int getPerformanceRating() {
        return performanceRating;
    }

    public void displayEmpDetails() {
        System.out.println("Employee Name:"+empName);
        System.out.println("Basic Salary"+basicSalary);
        System.out.println("Performance Rating"+performanceRating);

    }
} 

class Bonus {
    private double bonusAmount;

    public Bonus() {
        //defualt constructor
    }
    public double getBonusAmount() {
        return bonusAmount;
    }
    public static Bonus calculateBonus(Employee employee) {
        Bonus bonus=new Bonus();
        double basicSalary=employee.getBasicSalary();
        int rating=employee.getPerformanceRating();
        switch (rating) {
            case 1:
             bonus.bonusAmount=basicSalary*0.05;
             break;

            case 2:
             bonus.bonusAmount=basicSalary*0.10;
             break;
             
             case 3:
             bonus.bonusAmount=basicSalary*0.15;
             break;

             case 4:
             bonus.bonusAmount=basicSalary*0.20;
             break;

             case 5:
             bonus.bonusAmount=basicSalary*0.25;
             break;
             default:
             System.err.println("Invalid Performance Rating:");
        }
        return bonus;
    }
}



public class EmployeeBonusTest {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setEmpName("Param");
        employee.setBasicSalary(50000);
        employee.setPerformanceRating(4);

        employee.displayEmpDetails();

        Bonus bonus=Bonus.calculateBonus(employee);
        System.out.println("Bonus Amount:"+bonus.getBonusAmount());
    }
}
