// Factory Method Pattern
// Factory class that creates Shape objects based on type
// Advantages: Loose coupling, Easy to extend, Centralized object creation

public class ShapeFactory {
    /**
     * Factory method to create shapes
     * @param shapeType Type of shape to create
     * @return Shape instance
     */
    public static Shape createShape(String shapeType, double... params) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                if (params.length > 0) {
                    return new Circle(params[0]);
                }
                return new Circle(5);

            case "rectangle":
                if (params.length >= 2) {
                    return new Rectangle(params[0], params[1]);
                }
                return new Rectangle(4, 5);

            case "square":
                if (params.length > 0) {
                    return new Square(params[0]);
                }
                return new Square(4);

            default:
                throw new IllegalArgumentException("Unknown shape: " + shapeType);
        }
    }
}
