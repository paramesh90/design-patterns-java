// Client code demonstrating different Singleton implementations

public class SingletonClient {
    public static void main(String[] args) {
        System.out.println("=== Eager Initialization Singleton ===");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1 == singleton2: " + (singleton1 == singleton2));
        singleton1.doSomething();

        System.out.println("\n=== Lazy Initialization Singleton ===");
        SingletonLazy lazy1 = SingletonLazy.getInstance();
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println("lazy1 == lazy2: " + (lazy1 == lazy2));
        lazy1.display();

        System.out.println("\n=== Bill Pugh Singleton ===");
        SingletonBillPugh billPugh1 = SingletonBillPugh.getInstance();
        SingletonBillPugh billPugh2 = SingletonBillPugh.getInstance();
        System.out.println("billPugh1 == billPugh2: " + (billPugh1 == billPugh2));
        billPugh1.doTask();

        System.out.println("\n=== Enum Singleton ===");
        SingletonEnum enum1 = SingletonEnum.getInstance();
        SingletonEnum enum2 = SingletonEnum.getInstance();
        System.out.println("enum1 == enum2: " + (enum1 == enum2));
        enum1.doWork();

        System.out.println("\n=== Multi-threaded Test ===");
        testMultiThreadedSingleton();
    }

    private static void testMultiThreadedSingleton() {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                SingletonBillPugh instance = SingletonBillPugh.getInstance();
                System.out.println("Thread: " + Thread.currentThread().getName() + 
                                 " -> " + instance.hashCode());
            }).start();
        }
    }
}
