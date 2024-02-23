package sana;

public class Main {
    public static void main(String[] args) {
        // Create products using the factory
        Froute banana = FrouteFactory.createFrout("B");
        Froute mango = FrouteFactory.createFrout("M");

        
        banana.operation();
        mango.operation();
        banana.operation();
    }
}
