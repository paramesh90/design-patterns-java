// User class

public class User {
    private String name;
    private Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addUser(this);
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public void receive(String message, String sender) {
        System.out.println(name + " received: " + sender + " -> " + message);
    }
}
