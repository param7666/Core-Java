
//Write a java class with private feild String productName, double price and int quentity
//impiment setter with validation

public class Program03 {
    private String product_name;
    private double price;
    private int quentity;

    public void setProduct_name(String name) {
        this.product_name=name;
    }
    public void setQuentity(int quentity) {
        this.quentity=quentity;
    }
    public String getProduct_name() {
        return product_name;
    }
    public int getQuentity(){
        return quentity;
    }
    public double getPrice(){
        this.price=1000;
        return price*quentity;
    }
    public static void main(String[]args) {
        Program03 p=new Program03();
        p.setProduct_name("Condom");
        p.setQuentity(5);
        System.out.println("Product name: "+p.getProduct_name());
        System.out.println("Quentity: "+p.getQuentity());
        System.out.println("Bill: "+p.getPrice());
    }
}
