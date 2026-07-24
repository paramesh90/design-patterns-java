// Enum Singleton
// Easiest and most efficient way to implement Singleton
// Provides serialization and reflection safety out of the box

public enum SingletonEnum {
    INSTANCE;

    // Constructor is automatically private
    SingletonEnum() {
        System.out.println("Enum Singleton instance created");
    }

    public void doWork() {
        System.out.println("Working with Enum Singleton");
    }

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }
}
