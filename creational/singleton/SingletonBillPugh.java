// Bill Pugh Singleton (Thread-safe Lazy Initialization)
// Uses static inner class - considered best practice
// Combines lazy initialization with thread safety without synchronization overhead

public class SingletonBillPugh {
    // Private constructor
    private SingletonBillPugh() {
        System.out.println("Bill Pugh Singleton instance created");
    }

    // Static inner helper class
    private static class SingletonHelper {
        private static final SingletonBillPugh instance = new SingletonBillPugh();
    }

    // Public method to get instance
    public static SingletonBillPugh getInstance() {
        return SingletonHelper.instance;
    }

    public void doTask() {
        System.out.println("Performing task in Bill Pugh Singleton");
    }
}
