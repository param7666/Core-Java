//Java program to to understand getter or setter

public class Program01{
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String add){
        this.address=add;
    }
    public static void main(String []args) {

        Program01 p=new Program01();
        p.setName("Parmeshwar");
        p.setAge(18);
        p.setAddress("Nanded");
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getAddress());

    }
}