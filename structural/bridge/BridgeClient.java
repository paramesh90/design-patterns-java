// Bridge Pattern Client

public class BridgeClient {
    public static void main(String[] args) {
        System.out.println("=== Bridge Pattern ===");

        // Create shapes with different colors
        Shape redCircle = new Circle(5, new RedColor());
        Shape blueRectangle = new Rectangle(10, 5, new BlueColor());
        Shape redRectangle = new Rectangle(8, 4, new RedColor());
        Shape blueCircle = new Circle(3, new BlueColor());

        System.out.println("\n--- Drawing Shapes ---");
        redCircle.draw();
        blueRectangle.draw();
        redRectangle.draw();
        blueCircle.draw();

        System.out.println("\n--- Varying Combinations ---");
        Shape[] shapes = {
                new Circle(7, new RedColor()),
                new Rectangle(12, 6, new BlueColor()),
                new Circle(4, new BlueColor()),
                new Rectangle(5, 5, new RedColor())
        };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
