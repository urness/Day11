public class Motorcycle implements Vehicle {
    private int gear;
    private int speed;

    public Motorcycle() {
        gear = 1;
        speed = 0;
    }
    
    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp() {
        speed = speed + 5*gear;
    }

    public void applyBrakes() {
        speed = speed - 5;
        if (speed < 0) {
            speed = 0;
        }
    }

    @Override
    public String toString() {
        String returnString = "Motorcycle\n";
        returnString += " speed: " + speed + "\n";
        returnString += " gear: " + gear + "\n";
        return returnString;
    }
}