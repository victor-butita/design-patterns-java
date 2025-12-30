package ke.co.apollo;

//Implements the same Coffee interface with different preparation logic
//Uses brew() to include steamed milk in the preparation
//Returns a higher price of $4.50 to reflect added ingredients
//Demonstrates polymorphism with Espresso through shared interface
//Maintains the same interface structure with different internal behavior
//Is created by the factory when "latte" is requested

public class Latte implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Creamy Latte");
    }

    @Override
    public double getPrice() {
        return 4.50;
    }
}
