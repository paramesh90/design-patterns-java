// Prototype Pattern Client
// Demonstrates cloning objects

public class PrototypeClient {
    public static void main(String[] args) {
        System.out.println("=== Prototype Pattern ===");

        // Create original shapes
        CirclePrototype circlePrototype = new CirclePrototype();
        circlePrototype.setId("1");
        circlePrototype.setRadius(5);

        RectanglePrototype rectanglePrototype = new RectanglePrototype();
        rectanglePrototype.setId("2");
        rectanglePrototype.setWidth(10);
        rectanglePrototype.setHeight(20);

        System.out.println("\n--- Original Objects ---");
        circlePrototype.draw();
        rectanglePrototype.draw();

        // Clone objects
        System.out.println("\n--- Cloned Objects ---");
        CirclePrototype clonedCircle = (CirclePrototype) circlePrototype.clone();
        clonedCircle.setId("3");
        clonedCircle.draw();

        RectanglePrototype clonedRectangle = (RectanglePrototype) rectanglePrototype.clone();
        clonedRectangle.setId("4");
        clonedRectangle.draw();

        // Verify they are different objects
        System.out.println("\n--- Verification ---");
        System.out.println("Original Circle == Cloned Circle: " + (circlePrototype == clonedCircle));
        System.out.println("Original Rectangle == Cloned Rectangle: " + (rectanglePrototype == clonedRectangle));
        System.out.println("Original Circle equals Cloned Circle: " + (circlePrototype.equals(clonedCircle)));

        // Modify cloned objects
        System.out.println("\n--- After Modifying Cloned Objects ---");
        clonedCircle.setRadius(10);
        clonedRectangle.setWidth(15);
        clonedRectangle.setHeight(25);

        System.out.println("\nOriginal Shapes:");
        circlePrototype.draw();
        rectanglePrototype.draw();

        System.out.println("\nModified Clones:");
        clonedCircle.draw();
        clonedRectangle.draw();
    }
}
