class Car {
    public String company;
    public String model;
    public int year;
    public String milage;
    void setCarDetails() {
        Car car = new Car();
        car.company="Suzuki";
        car.model= "ABC2024";
        car.year=2024;
        car.milage="35";
    }
    void Display(){
        Car car=new Car();
        System.out.println(car.company);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(milage);
    }
    public class TestCar {
    public static void main(String[] args) {
        Car car=new Car();
        car.Display();

    }
    }
}