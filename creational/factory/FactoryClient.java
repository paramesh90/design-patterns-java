// Factory Pattern Client
// Demonstrates creating objects through factory

public class FactoryClient {
    public static void main(String[] args) {
        System.out.println("=== Factory Method Pattern ===");

        // Create shapes using factory
        Shape circle = ShapeFactory.createShape("circle", 7);
        Shape rectangle = ShapeFactory.createShape("rectangle", 10, 5);
        Shape square = ShapeFactory.createShape("square", 6);

        System.out.println("\n--- Circle ---");
        circle.draw();
        circle.calculateArea();

        System.out.println("\n--- Rectangle ---");
        rectangle.draw();
        rectangle.calculateArea();

        System.out.println("\n--- Square ---");
        square.draw();
        square.calculateArea();

        System.out.println("\n=== Creating shapes dynamically ===");
        String[] shapeTypes = {"circle", "rectangle", "square"};
        double[][] params = {{3}, {8, 4}, {5}};

        for (int i = 0; i < shapeTypes.length; i++) {
            Shape shape = ShapeFactory.createShape(shapeTypes[i], params[i]);
            shape.draw();
            shape.calculateArea();
            System.out.println();
        }
    }
}
