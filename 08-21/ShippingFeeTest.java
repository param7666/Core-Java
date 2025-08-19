


class Pacakge {
    private double packageWeight;
    private int shippingDistance;

    public Pacakge() {
        //defualt constructor
    }
    public void setPackageWeight(double weight) {
        this.packageWeight=weight;
    }
    public void setShippingDistance(int distance) {
        this.shippingDistance=distance;
    }
    public double getPackageWeight() {
        return packageWeight;
    }
    public int getShippingDistance() {
        return shippingDistance;
    }

    public void displayDetails() {
        System.out.println("Package Weight: "+packageWeight);
        System.out.println("Package shipping Distance: "+shippingDistance);
    }

}

    class ShippingFee{
        private double feeAmount;

        public double getFeeAmount() {
            return feeAmount;
        }

        public static ShippingFee calculateFee(Pacakge pkg) {
            ShippingFee fee=new ShippingFee();
            double weight =pkg.getPackageWeight();
            int distance = pkg.getShippingDistance();

            if(weight<=5) {
                if(distance<=100) {
                    fee.feeAmount=5.0;
                }
                else{
                    fee.feeAmount=10.0;
                } 
            }
            else if(weight<=20) {
                if(distance<=100) fee.feeAmount=10.0;
                else fee.feeAmount=20;
            }
            else {
                if(distance<=100) fee.feeAmount=20.0;
                else fee.feeAmount=40;
            }
            return fee;
        }
    }



public class ShippingFeeTest {
    public static void main(String[]args) {
        Pacakge pkg = new Pacakge();
        pkg.setPackageWeight(10);
        pkg.setShippingDistance(150);

        pkg.displayDetails();

        ShippingFee fee=ShippingFee.calculateFee(pkg);
        System.out.println("Shipping fee: "+fee.getFeeAmount());
    }
}
