// Mediator Pattern
// Purpose: Centralizes complex communications between objects
// Use Cases: Dialog coordination, Chat room, Air traffic control

public interface Mediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
}
