// Concrete Prototype: Rectangle

public class RectanglePrototype extends Shape {
    private int width;
    private int height;

    public RectanglePrototype() {
        this.type = "Rectangle";
    }

    public RectanglePrototype(RectanglePrototype rectangle) {
        super();
        this.width = rectangle.width;
        this.height = rectangle.height;
        this.type = rectangle.type;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle [ID: " + getId() + ", Type: " + type + 
                         ", Width: " + width + ", Height: " + height + "]");
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
