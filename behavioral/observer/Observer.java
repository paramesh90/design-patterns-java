// Observer Pattern
// Purpose: Define one-to-many dependency between objects
// Use Cases: Event handling, MVC architecture, Real-time notifications, Stock price updates

// Observer interface
public interface Observer {
    void update(String eventData);
}
