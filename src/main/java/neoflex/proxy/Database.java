package neoflex.proxy;

public class Database implements DatabaseConnection {

    private String dbName;

    public Database(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void connect() {
        System.out.println("Connected to database: localhost:1488/" + dbName);
    }
}
