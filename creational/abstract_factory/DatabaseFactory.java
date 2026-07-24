// Abstract Factory
// Factory interface that creates families of related products

public interface DatabaseFactory {
    DatabaseConnection createConnection();
}
