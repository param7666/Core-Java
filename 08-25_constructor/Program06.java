
//Question: Write a Java class Student with fields name (String), rollNumber (int),
// and course (String). Implement two constructors:
// one that takes all three fields as parameters and another that only takes
// name and rollNumber, with course set to "Undeclared" by default.

public class Program06 {
    private String name;
    private int rollNumber;
    private String course;

    public Program06(String name, int rollNumber, String course) {
        this.name=name;
        this.rollNumber=rollNumber;
        this.course=course;
    }
    public Program06(String name, int rollNumber) {
        this.name=name;
        this.rollNumber=rollNumber;
        this.course="JAVA";
    }
public static void main(String []args) {
    Program06 p1=new Program06("Param", 005,"Python");
    Program06 p2 = new Program06("Parmeshwar", 003);
    System.out.println("Name: "+p1.name);
    System.out.println("Roll Number: "+p1.rollNumber);
    System.out.println("Course: "+p1.course);

    System.out.println("============================");
    System.out.println("Name: "+p2.name);
    System.out.println("Roll Number: "+p2.rollNumber);
    System.out.println("Course: "+p2.course);
}
    
}
