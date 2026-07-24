// Concrete Abstraction: Rectangle

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.print("Drawing Rectangle (" + width + "x" + height + ") - ");
        color.applyColor();
    }
}
