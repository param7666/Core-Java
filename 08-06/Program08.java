public class Program08 { // student grade program
    void inputDetails() {
        String name="Parmeshwar";
        int marks1=89;
        int marks2=58;
        int marks3=93;
        Program08 obj=new Program08();
        obj.calculateGrade(marks1, marks2, marks3, name);
       
    }
    void calculateGrade(int marks1, int marks2, int marks3, String name) {
        int totalMarks=marks1+marks2+marks3;
        double average=totalMarks/3;
        char grade;
        if(average>=90) grade='A';
        else if(average>=80 && average<90) grade='B';
        else if (average>=70 && average<80) grade='C';
        else if (average>=60 && average<70) grade='D';
        else grade='F';
        Program08 obj=new Program08();
        obj.displayDetails(totalMarks, average, grade,name);
    }
    void displayDetails(int totalMarks, double average, char grade, String name) {
        System.out.println("Name: "+name);
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average: "+average);
        System.out.println("Grade: "+grade);
    }
    public static void main(String[] args) {
        Program08 obj=new Program08();
        obj.inputDetails();
    }
}
