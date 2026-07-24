// Interpreter Pattern Client

public class InterpreterClient {
    public static void main(String[] args) {
        System.out.println("=== Interpreter Pattern ===");

        // Create expressions
        Expression john = new LiteralExpression("John");
        Expression jane = new LiteralExpression("Jane");
        Expression bob = new LiteralExpression("Bob");
        Expression alice = new LiteralExpression("Alice");

        // Create complex expressions
        Expression isFemale = new OrExpression(jane, alice);
        Expression isMale = new OrExpression(john, bob);

        System.out.println("\n--- Interpreting Expressions ---");
        System.out.println("Is 'Jane' female? " + isFemale.interpret("Jane"));
        System.out.println("Is 'John' male? " + isMale.interpret("John"));
        System.out.println("Is 'John' female? " + isFemale.interpret("John"));
        System.out.println("Is 'Bob' male? " + isMale.interpret("Bob"));
        System.out.println("Is 'Alice' female? " + isFemale.interpret("Alice"));
        System.out.println("Is 'Charlie' male? " + isMale.interpret("Charlie"));

        // Complex expressions with AND
        System.out.println("\n--- More Complex Expressions ---");
        Expression james = new LiteralExpression("James");
        Expression david = new LiteralExpression("David");
        Expression maleNames = new OrExpression(john, new OrExpression(bob, new OrExpression(james, david)));

        System.out.println("Is 'James' a male name? " + maleNames.interpret("James"));
        System.out.println("Is 'David' a male name? " + maleNames.interpret("David"));
        System.out.println("Is 'Jane' a male name? " + maleNames.interpret("Jane"));
    }
}
