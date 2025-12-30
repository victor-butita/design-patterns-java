package ke.co.apollo;


//Implements the Coffee interface as a concrete product in the Factory pattern
//Uses @Override annotations to ensure correct method implementation
//Provides specific brewing logic in the brew() method
//Returns a fixed price of $2.50 using getPrice()
//Encapsulates its behavior and properties as a standalone coffee type
//Is created by the factory when "espresso" is requested

public class Espresso implements Coffee {

    @Override
    public void brew() {
        System.out.println("Brewing Strong Espresso");
    }

    @Override
    public double getPrice() {
        return 2.50;
    }
}
