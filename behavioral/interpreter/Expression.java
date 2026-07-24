// Interpreter Pattern
// Purpose: Define grammar and interpreter for a language
// Use Cases: SQL parsing, Expression evaluation, Query languages

public interface Expression {
    boolean interpret(String context);
}
