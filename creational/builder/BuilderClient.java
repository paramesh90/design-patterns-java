// Builder Pattern Client
// Demonstrates building complex objects step by step

public class BuilderClient {
    public static void main(String[] args) {
        System.out.println("=== Builder Pattern ===");

        // Create pizza with minimal configuration
        Pizza pizza1 = new Pizza.PizzaBuilder("Thin Crust", "Tomato")
                .build();
        System.out.println("\nPizza 1 (Minimal):");
        pizza1.display();

        // Create pizza with multiple toppings
        Pizza pizza2 = new Pizza.PizzaBuilder("Thick Crust", "White Sauce")
                .cheese("Mozzarella")
                .pepperoni("yes")
                .mushroom("yes")
                .size("large")
                .build();
        System.out.println("\nPizza 2 (With Toppings):");
        pizza2.display();

        // Create another pizza
        Pizza pizza3 = new Pizza.PizzaBuilder("Gluten Free", "Marinara")
                .cheese("Vegan")
                .onion("yes")
                .mushroom("yes")
                .size("small")
                .build();
        System.out.println("\nPizza 3 (Vegan):");
        pizza3.display();

        // Create custom pizzas
        System.out.println("\n=== Creating Multiple Pizzas ===");
        Pizza[] pizzas = {
                new Pizza.PizzaBuilder("Crispy", "BBQ").cheese("Cheddar").size("medium").build(),
                new Pizza.PizzaBuilder("Stuffed Crust", "Pesto").pepperoni("yes").size("large").build(),
                new Pizza.PizzaBuilder("Thin", "Garlic").onion("yes").mushroom("yes").size("small").build()
        };

        for (int i = 0; i < pizzas.length; i++) {
            System.out.println("\nPizza " + (i + 1) + ":");
            pizzas[i].display();
        }
    }
}
