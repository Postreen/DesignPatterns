package neoflex.proxy;

public class DatabaseProxy implements DatabaseConnection{
    private Database Database;
    private String host;
    private int port;

    public DatabaseProxy(String host, int port) {
        this.Database = new Database();
        this.host = host;
        this.port = port;
    }

    @Override
    public void connect(String dbName) {
        String fullUrl = String.format("http://%s:%d/%s", host, port, dbName);
        Database.connect(fullUrl);
    }
}
