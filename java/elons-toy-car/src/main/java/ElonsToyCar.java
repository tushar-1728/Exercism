public class ElonsToyCar {
    private int batteryPercentage = 100;
    private int distanceDriven = 0;

    public static ElonsToyCar buy() {
        ElonsToyCar newCar = new ElonsToyCar();
        return newCar;
    }

    public String distanceDisplay() {
        return ("Driven " + distanceDriven + " meters");
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return ("Battery empty");
        }
        return ("Battery at " + batteryPercentage + "%");
    }

    public void drive() {
        if (batteryPercentage > 0) {
            batteryPercentage -= 1;
            distanceDriven += 20;
        }
    }
}
