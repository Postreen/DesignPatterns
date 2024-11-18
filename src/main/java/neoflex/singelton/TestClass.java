package neoflex.singelton;

public class TestClass {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        logger.classLog(new TestClass(), "Some info");
        logger.classLog(new String(), "String some info");
    }
}
