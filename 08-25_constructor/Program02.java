public class Program02 {
    private double celsius;

    public void setCelsius(double celsius) {
        this.celsius=celsius;
    }
    public double getSecsius(){
        double fehrenhit;
        fehrenhit=(celsius*9/5)+32;
        return fehrenhit;
    }
    public static void main(String []args) {
        Program02 p=new Program02();
        p.setCelsius(12);
        System.out.println("Temp in Feharenhit:"+p.getSecsius());
    }
}
