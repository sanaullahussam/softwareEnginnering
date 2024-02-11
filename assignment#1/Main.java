// package strategy;

import Cars.AggressiveDrivingStrategy;
import Cars.Car;
import Cars.DrivingStrategy;
import Cars.NormalDrivingStrategy;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        // Set normal driving strategy
        car.setDrivingStrategy(new NormalDrivingStrategy());
        car.accelerate();
        car.brake();

        // Set aggressive driving strategy
        car.setDrivingStrategy(new AggressiveDrivingStrategy());
        car.accelerate();
        car.brake();
    }
}

