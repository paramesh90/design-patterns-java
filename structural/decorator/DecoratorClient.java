// Decorator Pattern Client
// Demonstrates adding responsibilities dynamically

public class DecoratorClient {
    public static void main(String[] args) {
        System.out.println("=== Decorator Pattern ===");

        // Simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("\n" + simpleCoffee.getDescription() + " - $" + simpleCoffee.getPrice());

        // Coffee with milk
        Coffee coffeeWithMilk = new MilkDecorator(new SimpleCoffee());
        System.out.println(coffeeWithMilk.getDescription() + " - $" + coffeeWithMilk.getPrice());

        // Coffee with milk and caramel
        Coffee coffeeWithMilkAndCaramel = new CaramelDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(coffeeWithMilkAndCaramel.getDescription() + " - $" + coffeeWithMilkAndCaramel.getPrice());

        // Coffee with all additions
        Coffee premiumCoffee = new WhippedCreamDecorator(
                new CaramelDecorator(
                        new MilkDecorator(new SimpleCoffee())
                )
        );
        System.out.println(premiumCoffee.getDescription() + " - $" + premiumCoffee.getPrice());

        System.out.println("\n=== Flexible Combinations ===");
        createCustomCoffee("Simple");
        createCustomCoffee("Milk");
        createCustomCoffee("Milk+Caramel");
        createCustomCoffee("All");
    }

    private static void createCustomCoffee(String type) {
        Coffee coffee = new SimpleCoffee();

        switch (type) {
            case "Milk":
                coffee = new MilkDecorator(coffee);
                break;
            case "Milk+Caramel":
                coffee = new MilkDecorator(coffee);
                coffee = new CaramelDecorator(coffee);
                break;
            case "All":
                coffee = new MilkDecorator(coffee);
                coffee = new CaramelDecorator(coffee);
                coffee = new WhippedCreamDecorator(coffee);
                break;
        }

        System.out.println(coffee.getDescription() + " - $" + coffee.getPrice());
    }
}
