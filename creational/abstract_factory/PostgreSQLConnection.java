// Concrete Product: PostgreSQL Connection

public class PostgreSQLConnection implements DatabaseConnection {
    private String host = "localhost";
    private String port = "5432";
    private boolean connected = false;

    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL Database at " + host + ":" + port);
        connected = true;
    }

    @Override
    public void executeQuery(String query) {
        if (connected) {
            System.out.println("Executing PostgreSQL Query: " + query);
        } else {
            System.out.println("Not connected to PostgreSQL");
        }
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL Database");
        connected = false;
    }
}
