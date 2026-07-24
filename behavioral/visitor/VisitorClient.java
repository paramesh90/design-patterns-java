// Visitor Pattern Client

public class VisitorClient {
    public static void main(String[] args) {
        System.out.println("=== Visitor Pattern ===");

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(10, 5),
                new Circle(3),
                new Rectangle(8, 4)
        };

        System.out.println("\n--- Calculating Areas ---");
        Visitor areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("\n--- Calculating Perimeters ---");
        Visitor perimeterCalculator = new PerimeterCalculator();
        for (Shape shape : shapes) {
            shape.accept(perimeterCalculator);
        }
    }
}
