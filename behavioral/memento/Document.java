// Originator

public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
        System.out.println("Document content updated: " + content);
    }

    public String getContent() {
        return content;
    }

    public Memento save() {
        System.out.println("Saving memento...");
        return new Memento(content);
    }

    public void restore(Memento memento) {
        content = memento.getState();
        System.out.println("Document restored to: " + content);
    }
}
