package ke.co.apollo;

// Factory class - creates coffee objects
//Implements the Factory pattern by encapsulating object creation logic
//Defines a static method so the client can call CoffeeFactory.createCoffee() without instantiating the factory
//Uses Java 21 switch expressions with yield to return the correct coffee object
//Applies toLowerCase() to make input case-insensitive
//Returns the Coffee interface type to promote loose coupling
//Returns null for unknown input to allow graceful error handling in the client code

public class CoffeeFactory {

    public static Coffee createCoffee(String type) {
        return switch(type.toLowerCase()){
            case "espresso" -> {
                System.out.println("🏭 Creating Espresso");
                yield new Espresso();
            }
            case "latte" -> {
                System.out.println("🏭 Creating Latte");
                yield new Latte();
            }
            default -> {
                System.out.println("❌ Unknown coffee type: " + type);
                yield null;
            }
        };

    }
}
