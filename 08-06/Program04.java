public class Program04 {

    void bill(double price, int quentity) {
        double netprice=price*quentity;
        if(price<20000) {
            double discount=(price*20)/100;
            double totalPrice=netprice-discount;
            System.out.println("NetPrice="+netprice);
            System.out.println("Discount="+discount);
            System.out.println("Total Amount to be paid="+totalPrice);
        } else {
            double discount=(price*10)/100;
            double totalPrice=netprice-discount;
            System.out.println("NetPrice="+netprice);
            System.out.println("Discount="+discount);
            System.out.println("Total Amount to be paid="+totalPrice);
        }

    }
    public static void main(String [] args) {
        double price=10000;
        int quentity=5;
        Program04 obj=new Program04();
       obj.bill(price, quentity);
    }
}
