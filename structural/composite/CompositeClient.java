// Composite Pattern Client

public class CompositeClient {
    public static void main(String[] args) {
        System.out.println("=== Composite Pattern ===");

        // Create menu structure
        Menu mainMenu = new Menu("Main Menu");

        Menu appetizers = new Menu("Appetizers");
        appetizers.addItem(new Item("Soup", 5.99));
        appetizers.addItem(new Item("Salad", 4.99));

        Menu mainCourses = new Menu("Main Courses");
        mainCourses.addItem(new Item("Pizza", 12.99));
        mainCourses.addItem(new Item("Pasta", 10.99));
        mainCourses.addItem(new Item("Steak", 18.99));

        Menu desserts = new Menu("Desserts");
        desserts.addItem(new Item("Cake", 6.99));
        desserts.addItem(new Item("Ice Cream", 3.99));

        mainMenu.addItem(appetizers);
        mainMenu.addItem(mainCourses);
        mainMenu.addItem(desserts);

        System.out.println("\n--- Restaurant Menu ---");
        mainMenu.display("");

        System.out.println("\n--- Total Cost of All Items ---");
        System.out.println("Total: $" + mainMenu.getPrice());

        System.out.println("\n--- Individual Menu Totals ---");
        System.out.println("Appetizers Total: $" + appetizers.getPrice());
        System.out.println("Main Courses Total: $" + mainCourses.getPrice());
        System.out.println("Desserts Total: $" + desserts.getPrice());
    }
}
