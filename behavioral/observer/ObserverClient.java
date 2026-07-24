// Observer Pattern Client

public class ObserverClient {
    public static void main(String[] args) {
        System.out.println("=== Observer Pattern ===");

        Subject stockMarket = new Subject();

        // Create observers
        StockObserver trader1 = new StockObserver("Trader 1");
        StockObserver trader2 = new StockObserver("Trader 2");
        NewsObserver news = new NewsObserver("CNN");

        System.out.println("\n--- Attaching Observers ---");
        stockMarket.attach(trader1);
        stockMarket.attach(trader2);
        stockMarket.attach(news);

        System.out.println("\n--- Stock Price Update ---");
        stockMarket.setState("Stock ABC: $150.50");

        System.out.println("\n--- Detach One Observer ---");
        stockMarket.detach(trader2);

        System.out.println("\n--- Another Update ---");
        stockMarket.setState("Stock ABC: $152.75");

        System.out.println("\n--- Multiple Events ---");
        String[] updates = {"Stock XYZ: $85.00", "Stock XYZ: $87.50", "Stock XYZ: $89.25"};
        for (String update : updates) {
            stockMarket.setState(update);
        }
    }
}
