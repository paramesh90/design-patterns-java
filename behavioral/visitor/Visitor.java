// Visitor Pattern
// Purpose: Add operations to objects without modifying them
// Use Cases: Parsing, Compilation, Report generation

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
