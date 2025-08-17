
//Question: Create a Java class Car with fields make (String), model (String), and year (int).
// Implement a constructor that takes all three fields as parameters.
// Then, implement another constructor that only takes make and model as parameters, and calls the first
// constructor using this to set a default year of 2024.




public class Program08 {
    private String make;
    private String model;
    private int year;

    public Program08(String make, String model, int year) {
        this.make=make;
        this.model=model;
        this.year=year;
    } 

    public Program08(String make, String model) {
        this(make,model,2024);
    }

    public void displayDetails() {
        System.out.println("Car Make By: "+make);
        System.out.println("Car model: "+model);
        System.out.println("Car Year: "+year);
    }

    public static void main(String []args) {
        Program08 p1=new Program08("BMW","BMW12",2022);
        p1.displayDetails();
        System.out.println("=======================================");
        Program08 p2 = new Program08("Honda", "Honda222");
        p2.displayDetails();
    }
}
