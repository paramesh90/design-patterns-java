// Terminal Expression: Literal

public class LiteralExpression implements Expression {
    private String literal;

    public LiteralExpression(String literal) {
        this.literal = literal;
    }

    @Override
    public boolean interpret(String context) {
        return context.equals(literal);
    }
}
