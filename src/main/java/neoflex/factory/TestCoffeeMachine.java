package neoflex.factory;


public class TestCoffeeMachine {
    public static void main(String[] args) {
        Coffee espresso = CoffeeFactory.createCoffee(CoffeeType.AMERICANO);
        espresso.prepare();

        Coffee americano = CoffeeFactory.createCoffee(CoffeeType.ESPRESSO);
        americano.prepare();

    }
}
