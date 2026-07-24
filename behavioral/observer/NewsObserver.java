// Concrete Observer: News Observer

public class NewsObserver implements Observer {
    private String channel;

    public NewsObserver(String channel) {
        this.channel = channel;
    }

    @Override
    public void update(String eventData) {
        System.out.println("[" + channel + "] Breaking news: " + eventData);
    }
}
