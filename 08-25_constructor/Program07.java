//Question: Write a Java class Rectangle with fields length (double) and width (double).
// Implement a default constructor that sets the length and width to 1.0, and a parameterized constructor
// that allows setting the length and width to specified values.
// Write a method to calculate and return the area of the rectangle.


public class Program07 {
    private double length;
    private double width;

    public Program07() {
        //defulat constructor
        this.length=1.0;
        this.width=1.0;
    }
    public Program07(double length, double width) {
        this.length=length;
        this.width=width;
    }
    public double calculateArea() {
        double result = length*width;
        return result;
    }

    public static void main(String []args) {
        Program07 p1=new Program07();
        System.out.println("Area of Rectangle: "+p1.calculateArea());
        Program07 p2=new Program07(10,10);
        System.out.println("==============================");
        System.out.println("Area of rectangle: "+p2.calculateArea());
    }

}
