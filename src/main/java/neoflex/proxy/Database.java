package neoflex.proxy;

public class Database implements DatabaseConnection {

    @Override
    public void connect(String dbName) {
        System.out.println("Connected to database: " + dbName);
    }
}
