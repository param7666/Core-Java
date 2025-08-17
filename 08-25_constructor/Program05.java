
// Write a Java class Book with fields title (String), author (String),
// and price (double). Implement a constructor that takes all three fields
// as parameters and initializes them. Write a method to
// display the book details.

public class Program05 {
    private String title;
    private String author;
    private double price;

    public Program05(String title, String author, double price) {
        this.title=title;
        this.author=author;
        this.price=price;
    } 
    public void displayDetails() {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

    public static void main(String []args) {
        Program05 p=new Program05("The art of java","Mr.Param",5000.00);
        p.displayDetails();
    }
}
