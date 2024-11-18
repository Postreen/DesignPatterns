package neoflex.factory;

public class Americano extends Coffee {

    @Override
    public void prepare() {
        System.out.println("Americano is being prepared");
    }
}
