class NeedForSpeed {
    private int speed;
    private int batteryDrainRate;
    private int battery;
    private int distance;

    public NeedForSpeed(int speed, int batteryDrainRate) {
        this.speed = speed;
        this.batteryDrainRate = batteryDrainRate;
        this.battery = 100;
        this.distance = 0;
    }

    public boolean batteryDrained() {
        return battery < batteryDrainRate;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (battery >= batteryDrainRate) {
            battery -= batteryDrainRate;
            distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public static void main(String[] args) {
        int speed = 10;
        int batteryDrain = 2;
        var car = new NeedForSpeed(speed, batteryDrain);

        int distance = 100;
        var race = new RaceTrack(distance);

        System.out.println(race.tryFinishTrack(car));
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
            if (car.distanceDriven() >= this.distance) {
                return true;
            }
        }
        return false;
    }
}
