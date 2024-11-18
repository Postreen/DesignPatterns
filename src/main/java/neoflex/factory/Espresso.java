package neoflex.factory;

public class Espresso extends Coffee{

    @Override
    public void prepare() {
        System.out.println("Espresso is being prepared");
    }
}
