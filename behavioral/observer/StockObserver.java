// Concrete Observer: Stock Price Observer

public class StockObserver implements Observer {
    private String name;

    public StockObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventData) {
        System.out.println("[" + name + "] Stock price updated: " + eventData);
    }
}
