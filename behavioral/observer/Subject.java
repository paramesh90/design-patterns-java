// Subject interface

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.println("Observer attached");
        }
    }

    public void detach(Observer observer) {
        if (observers.remove(observer)) {
            System.out.println("Observer detached");
        }
    }

    public void notify(String eventData) {
        for (Observer observer : observers) {
            observer.update(eventData);
        }
    }

    public void setState(String state) {
        this.state = state;
        notify(state);
    }

    public String getState() {
        return state;
    }
}
