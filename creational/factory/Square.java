// Concrete Product: Square

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square with side: " + side);
    }

    @Override
    public void calculateArea() {
        double area = side * side;
        System.out.println("Square area: " + area);
    }
}
