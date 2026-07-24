// Mediator Pattern Client

public class MediatorClient {
    public static void main(String[] args) {
        System.out.println("=== Mediator Pattern ===");

        Mediator chatRoom = new ChatRoom();

        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);
        User user3 = new User("Charlie", chatRoom);

        System.out.println("\n--- Users Sending Messages ---");
        user1.send("Hello everyone!");
        System.out.println();

        user2.send("Hi Alice, how are you?");
        System.out.println();

        user3.send("Hey guys!");
        System.out.println();

        user1.send("I'm doing great!");
    }
}
