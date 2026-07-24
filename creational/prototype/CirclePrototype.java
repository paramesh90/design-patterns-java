// Concrete Prototype: Circle

public class CirclePrototype extends Shape {
    private int radius;

    public CirclePrototype() {
        this.type = "Circle";
    }

    public CirclePrototype(CirclePrototype circle) {
        super();
        this.radius = circle.radius;
        this.type = circle.type;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle [ID: " + getId() + ", Type: " + type + 
                         ", Radius: " + radius + "]");
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
