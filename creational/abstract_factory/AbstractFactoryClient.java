// Abstract Factory Pattern Client
// Demonstrates creating families of related objects

public class AbstractFactoryClient {
    public static void main(String[] args) {
        System.out.println("=== Abstract Factory Pattern ===");

        // Using MySQL
        System.out.println("\n--- MySQL Configuration ---");
        DatabaseFactory mysqlFactory = new MySQLFactory();
        DatabaseConnection mysqlConnection = mysqlFactory.createConnection();
        mysqlConnection.connect();
        mysqlConnection.executeQuery("SELECT * FROM users");
        mysqlConnection.executeQuery("UPDATE users SET status = 'active'");
        mysqlConnection.disconnect();

        // Using PostgreSQL
        System.out.println("\n--- PostgreSQL Configuration ---");
        DatabaseFactory postgresqlFactory = new PostgreSQLFactory();
        DatabaseConnection postgresqlConnection = postgresqlFactory.createConnection();
        postgresqlConnection.connect();
        postgresqlConnection.executeQuery("SELECT COUNT(*) FROM products");
        postgresqlConnection.executeQuery("DELETE FROM products WHERE id = 5");
        postgresqlConnection.disconnect();

        // Dynamic factory selection
        System.out.println("\n--- Dynamic Factory Selection ---");
        testWithDifferentDatabases("MySQL", "SELECT * FROM orders");
        testWithDifferentDatabases("PostgreSQL", "SELECT * FROM customers");
    }

    private static void testWithDifferentDatabases(String dbType, String query) {
        DatabaseFactory factory;
        
        if (dbType.equalsIgnoreCase("MySQL")) {
            factory = new MySQLFactory();
        } else if (dbType.equalsIgnoreCase("PostgreSQL")) {
            factory = new PostgreSQLFactory();
        } else {
            throw new IllegalArgumentException("Unknown database type: " + dbType);
        }

        DatabaseConnection connection = factory.createConnection();
        connection.connect();
        connection.executeQuery(query);
        connection.disconnect();
        System.out.println();
    }
}
