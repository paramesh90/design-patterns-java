// Iterator Pattern
// Purpose: Access elements sequentially without exposing structure
// Use Cases: Collection iteration, Tree traversal

public interface Iterator {
    boolean hasNext();
    Object next();
}
