// Builder Pattern
// Purpose: Construct complex objects step by step
// Use Cases: Creating objects with many parameters, Configuration objects

public class Pizza {
    // Required parameters
    private final String dough;
    private final String sauce;

    // Optional parameters
    private final String cheese;
    private final String pepperoni;
    private final String mushroom;
    private final String onion;
    private final String size;

    // Private constructor - only builder can instantiate
    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushroom = builder.mushroom;
        this.onion = builder.onion;
        this.size = builder.size;
    }

    @Override
    public String toString() {
        return "Pizza[" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", pepperoni='" + pepperoni + '\'' +
                ", mushroom='" + mushroom + '\'' +
                ", onion='" + onion + '\'' +
                ", size='" + size + '\'' +
                "]";
    }

    public void display() {
        System.out.println(this.toString());
    }

    // Static inner Builder class
    public static class PizzaBuilder {
        // Required parameters
        private final String dough;
        private final String sauce;

        // Optional parameters
        private String cheese = "none";
        private String pepperoni = "no";
        private String mushroom = "no";
        private String onion = "no";
        private String size = "medium";

        // Constructor with required parameters
        public PizzaBuilder(String dough, String sauce) {
            this.dough = dough;
            this.sauce = sauce;
        }

        // Setter methods for optional parameters
        public PizzaBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder pepperoni(String pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder mushroom(String mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        public PizzaBuilder onion(String onion) {
            this.onion = onion;
            return this;
        }

        public PizzaBuilder size(String size) {
            this.size = size;
            return this;
        }

        // Build method to create Pizza instance
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
