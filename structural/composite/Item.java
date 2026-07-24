// Leaf Component

public class Item extends MenuItem {
    public Item(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name + " - $" + price);
    }
}
