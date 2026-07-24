// Facade Pattern
// Purpose: Provide simplified interface to complex subsystem
// Use Cases: Library APIs, Subsystem simplification, Complex workflows

// Complex subsystem classes
public class CPU {
    public void start() {
        System.out.println("CPU: starting...");
    }

    public void stop() {
        System.out.println("CPU: stopped.");
    }
}
