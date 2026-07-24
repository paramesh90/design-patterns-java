// Concrete Factory: MySQL

public class MySQLFactory implements DatabaseFactory {
    @Override
    public DatabaseConnection createConnection() {
        System.out.println("Creating MySQL Connection via MySQLFactory");
        return new MySQLConnection();
    }
}
