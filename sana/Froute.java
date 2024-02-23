package sana;

public interface Froute {

    void operation();
} 
class banana implements Froute {

    @Override
    public void operation() {
    
        System.out.println("the banana class is instantiated!");
    }

}
class mango implements Froute{

    @Override
    public void operation() {
        System.out.println("The mango class is instantiated!");
        
    }

}
class FrouteFactory{
    public static Froute createFrout(String type) {
        switch (type) {
            case "B":
                return new banana();
            case "M":
                return new mango();
            default:
                throw new IllegalArgumentException("Invalid froute type: " + type);
        }
    }
}