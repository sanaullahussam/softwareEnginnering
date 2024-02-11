package Cars;
public class NormalDrivingStrategy implements DrivingStrategy {
    @Override
    public void accelerate() {
        System.out.println("Normal acceleration");
    }

    @Override
    public void brake() {
        System.out.println("Normal braking");
    }
}
