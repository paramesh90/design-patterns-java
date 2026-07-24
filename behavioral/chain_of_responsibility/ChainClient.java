// Chain of Responsibility Pattern Client

public class ChainClient {
    public static void main(String[] args) {
        System.out.println("=== Chain of Responsibility Pattern ===");

        // Create handlers
        Handler manager = new Manager();
        Handler director = new Director();
        Handler vp = new VP();

        // Setup chain
        manager.setNextHandler(director);
        director.setNextHandler(vp);

        // Test requests
        System.out.println("\n--- Processing Requests ---");
        Request request1 = new Request("Expense", 5000);
        Request request2 = new Request("Expense", 25000);
        Request request3 = new Request("Expense", 75000);
        Request request4 = new Request("Expense", 150000);

        manager.handleRequest(request1);
        manager.handleRequest(request2);
        manager.handleRequest(request3);
        manager.handleRequest(request4);
    }
}
