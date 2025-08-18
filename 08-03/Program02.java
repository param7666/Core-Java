public class Program02 {

    public static void electronicCart(String product, String brand, String type, int quentity) {
        if((brand.equals("Sony")||brand.equals("Samsung"))&&(type.equals("TV")||type.equals("Laptop"))) {
           double price = buyNowElectronics(type, quentity);
            bill(product, brand, type, quentity, price);
        }
    }

    public static double buyNowElectronics(String type, int quantity){
        double price=0;
        if(type.equals("TV")) {
            System.out.println("Price of the TV is Rs.50,000");
            System.out.println("Discount on the product is 15%");
            double perPrice=50000;
            double discount=(perPrice*quantity)/0.15;
            price=discount-perPrice;

        } else if(type.equals("Laptop")) {
                System.out.println("Price of the Laptop is Rs.70,000");
                System.out.println("Discount on the Product is 10%");
                double perPrice=70000;
                double discount=(perPrice*quantity)/0.10;
                 price=discount-perPrice;
        } else {
            System.out.println("Wrong Input");
        }
        return price;
    }

    public static void bill(String product, String brand, String type, int quantity, double price) {
        if(type.equals("TV")) {
            System.out.println("PRoduct: "+product);
            System.out.println("Type: "+type);
            System.out.println("Brand: "+brand);
            System.out.println("Quentity: "+quantity);
            System.out.println("Price: "+price);
        } else if(type.equals("Laptop")) {
            System.out.println("PRoduct: "+product);
            System.out.println("Type: "+type);
            System.out.println("Brand: "+brand);
            System.out.println("Quentity: "+quantity);
            System.out.println("Price: "+price);
        } else {
            System.out.println("HELLO");
        }
    }
    public static void booksCart() {

    }
    public static void buyNowBooks() {

    }
    public static void bookBill() {

    }
    public static void main(String[] args) {
        int op=1;
        if(op==1) {
            electronicCart("Electroncs", "Sony", "TV", 4);
        } else if(op==2) {

        } else{
            System.out.println("Wrong Input");
        }
    }
}
