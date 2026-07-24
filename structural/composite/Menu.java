// Composite Component

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuItem {
    private List<MenuItem> items = new ArrayList<>();

    public Menu(String name) {
        super(name, 0);
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "[Menu] " + name);
        for (MenuItem item : items) {
            item.display(indent + "  ");
        }
    }
}
