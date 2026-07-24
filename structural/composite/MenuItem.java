// Composite Pattern
// Purpose: Compose objects into tree structures to represent part-whole hierarchies
// Use Cases: File systems, UI hierarchies, Menu structures

import java.util.ArrayList;
import java.util.List;

public abstract class MenuItem {
    protected String name;
    protected double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double getPrice();
    public abstract void display(String indent);
}
