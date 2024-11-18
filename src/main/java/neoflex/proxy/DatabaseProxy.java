package neoflex.proxy;

public class DatabaseProxy implements DatabaseConnection{
    private Database Database;
    private String dbName;

    public DatabaseProxy(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void connect() {
        if (Database == null) {
            Database = new Database(dbName);
        }
        System.out.println("Proxy in action: Adding URL prefix");
        Database.connect();
    }
}
