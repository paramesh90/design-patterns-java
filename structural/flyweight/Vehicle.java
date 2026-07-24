// Flyweight Pattern
// Purpose: Share objects to optimize memory usage
// Use Cases: Object pooling, Character rendering, Connection pooling

import java.util.HashMap;
import java.util.Map;

// Flyweight interface
public interface Vehicle {
    void drive(String destination);
}
