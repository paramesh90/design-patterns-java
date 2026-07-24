// Concrete Product: MySQL Connection

public class MySQLConnection implements DatabaseConnection {
    private String host = "localhost";
    private String port = "3306";
    private boolean connected = false;

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database at " + host + ":" + port);
        connected = true;
    }

    @Override
    public void executeQuery(String query) {
        if (connected) {
            System.out.println("Executing MySQL Query: " + query);
        } else {
            System.out.println("Not connected to MySQL");
        }
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL Database");
        connected = false;
    }
}
