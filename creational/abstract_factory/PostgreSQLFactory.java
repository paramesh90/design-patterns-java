// Concrete Factory: PostgreSQL

public class PostgreSQLFactory implements DatabaseFactory {
    @Override
    public DatabaseConnection createConnection() {
        System.out.println("Creating PostgreSQL Connection via PostgreSQLFactory");
        return new PostgreSQLConnection();
    }
}
