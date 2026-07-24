// Abstract Factory Pattern
// Purpose: Create families of related objects without specifying concrete classes
// Use Cases: Database connections, UI components for different platforms, Document creation

// Abstract product interface
public interface DatabaseConnection {
    void connect();
    void executeQuery(String query);
    void disconnect();
}
