package neoflex.proxy;

public class TestDatabaseProxy {
    public static void main(String[] args) {

        DatabaseConnection dbProxy = new DatabaseProxy("myDatabase");

        dbProxy.connect();
    }
}
