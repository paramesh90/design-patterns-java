// Lazy Initialization Singleton
// Instance is created only when first accessed
// Thread-safe version using synchronized block

public class SingletonLazy {
    // Static instance - null initially
    private static SingletonLazy instance;

    // Private constructor
    private SingletonLazy() {
        System.out.println("Lazy Singleton instance created");
    }

    // Synchronized method for thread safety
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void display() {
        System.out.println("Lazy Singleton instance");
    }
}
