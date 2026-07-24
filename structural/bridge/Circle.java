// Concrete Abstraction: Circle

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle with radius: " + radius + " - ");
        color.applyColor();
    }
}
