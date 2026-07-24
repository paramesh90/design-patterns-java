// Command Pattern
// Purpose: Encapsulate requests as objects
// Use Cases: Undo/Redo, Task scheduling, Macro recording, Event handling

// Command interface
public interface Command {
    void execute();
    void undo();
}
