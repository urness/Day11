import java.util.ArrayList;

public class VehicleDriver {
    public static void main(String[] args) {
        ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
        
        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.changeGear(3);
        myMotorcycle.speedUp();
        myMotorcycle.speedUp();
        garage.add(myMotorcycle);

        Motorcycle yourMotorcycle = new Motorcycle();
        garage.add(yourMotorcycle);

        Car herbie = new Car();
        garage.add(herbie);
        
        for (Vehicle v : garage){
            v.applyBrakes();
            System.out.println(v);
        }

    }
}
