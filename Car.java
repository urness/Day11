public class Car implements Vehicle{

    private int gear;
    private int speed;

    public Car() {
        gear = 1;
        speed = 0;
    }
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp() {
        speed = speed + 10*gear;
    }

    @Override
    public void applyBrakes() {
        speed = speed - 10;
        if (speed < 0) {
            speed = 0;
        }
    }

    @Override
    public String toString() {
        String returnString = "Car\n";
        returnString += " speed: " + speed + "\n";
        returnString += " gear: " + gear + "\n";
        return returnString;
    }
    
}
