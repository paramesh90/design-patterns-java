// Memento Pattern Client

public class MementoClient {
    public static void main(String[] args) {
        System.out.println("=== Memento Pattern ===");

        Document document = new Document("Initial content");
        DocumentHistory history = new DocumentHistory();

        System.out.println("\n--- Creating Document Versions ---");
        history.saveState(document);

        document.setContent("Updated content");
        history.saveState(document);

        document.setContent("Final content");
        history.saveState(document);

        System.out.println("\n--- Current Content ---");
        System.out.println("Content: " + document.getContent());

        history.printHistory();

        System.out.println("\n--- Restoring from History ---");
        history.restoreState(document, 0);
        System.out.println("Content: " + document.getContent());

        history.restoreState(document, 2);
        System.out.println("Content: " + document.getContent());
    }
}
