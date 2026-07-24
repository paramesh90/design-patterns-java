// Singleton Pattern
// Purpose: Ensures a class has only one instance and provides a global point of access to it.
// Use Cases: Database connections, Logger, Configuration manager, Thread pools

/**
 * Eager Initialization Singleton
 * Instance is created when the class is loaded
 */
public class Singleton {
    // Static instance created at class loading time
    private static final Singleton instance = new Singleton();

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Public method to get instance
    public static Singleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Doing something in Singleton");
    }
}
