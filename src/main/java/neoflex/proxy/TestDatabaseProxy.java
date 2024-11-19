package neoflex.proxy;

public class TestDatabaseProxy {
    public static void main(String[] args) {

        Database db = new Database();
        DatabaseConnection dbProxy = new DatabaseProxy("localhost", 1488);

        db.connect("myDatabase");
        dbProxy.connect("myDatabase");
    }
}
