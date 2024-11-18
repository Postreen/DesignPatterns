package neoflex.factory;

public class CoffeeFactory {
    public static Coffee createCoffee(CoffeeType coffeeType) {
        Coffee coffee;
        switch (coffeeType) {
            case ESPRESSO -> {
                coffee = new Espresso();
            }
            case AMERICANO -> {
                coffee = new Americano();
            }
            default -> {
                throw new IllegalArgumentException("Unknown coffee type: " + coffeeType);
            }
        }
        return coffee;
    }
}
