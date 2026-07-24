// Memento Pattern
// Purpose: Capture and externalizes object state
// Use Cases: Undo/Redo, Save points, State snapshots

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
