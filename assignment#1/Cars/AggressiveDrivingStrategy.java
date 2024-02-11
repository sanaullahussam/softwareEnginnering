package Cars;

public class AggressiveDrivingStrategy implements DrivingStrategy {
    @Override
    public void accelerate() {
        System.out.println("Aggressive acceleration");
    }

    @Override
    public void brake() {
        System.out.println("Aggressive braking");
    }
}
