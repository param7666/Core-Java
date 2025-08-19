class Vahicle{
    private String vehicleType;
    private int vehicleAge;

    public void setVahicleType(String type) {
        this.vehicleType=type;
    }
    public String getVahicleType() {
        return vehicleType;
    }
    public void setVehicleAge(int age) {
        this.vehicleAge=age;
    }
    public int getVahicleAge(){
        return vehicleAge;
    }

    public void displayDetails() {
        System.out.println("Vahicle Type:"+vehicleType);
        System.out.println("Vahicle Age:"+vehicleAge);

    }
}


class InsurancePremium {
 private double premiumAmmount;

 public double getPremiumAmmount() {
    return premiumAmmount;
 }
 
 public static InsurancePremium calculatePremium(Vahicle vehicle, double vehicleValue) {
    InsurancePremium insurancePremium = new InsurancePremium();
    double primiumRate =0.0;

    switch (vehicle.getVahicleType) {
        case "Car":
            if(vehicle.getVahicleAge()<5) {
                primiumRate = 0.05;
            }
            else if(vehicle.getVahicleAge()<10) {
                primiumRate = 0.07;
            } else {
                primiumRate = 0.10;
            }
            break;
            case "Motorcycle":
            if(vehicle.getVahicleAge()<3) {
                primiumRate=0.03;
            }
            else if(vehicle.getVahicleAge()<=8) {
                primiumRate=0.05;
            } else {
                primiumRate = 0.08;
            }
            break;
            case "Truck":
            if(vehicle.getVahicleAge()<5) {
                primiumRate=0.06;
            }
            else if(vehicle.getVahicleAge()<=10) {
                primiumRate=0.08;
            }
            else {
                primiumRate=0.12;
            }
            break;
    
        default:
        System.out.println("Unknown vehicle type");
            break;
            return null;
    }

    insurancePremium.premiumAmmount=primiumRate*vehicleValue;
    return insurancePremium;
 } 
}
public class VehicleInsuranceTest {

    public static void main(String []args) {
        Vahicle myVahicle = new Vahicle();
        myVahicle.setVahicleType("Car");
        myVahicle.setVehicleAge(6);

        myVahicle.displayDetails();
        double vehicleValue = 20000.00;

        InsurancePremium premium=InsurancePremium.calculatePremium(vehicle, vehicleValue);
        if(premium!=null) {
            System.out.println("Insurance Premium: "+premium.getPremiumAmmount());
        }
    }
}