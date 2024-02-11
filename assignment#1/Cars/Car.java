package Cars;

public class Car {
    private DrivingStrategy drivingStrategy;

    public void setDrivingStrategy(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }

    public void accelerate() {
        drivingStrategy.accelerate();
    }

    public void brake() {
        drivingStrategy.brake();
    }
}
