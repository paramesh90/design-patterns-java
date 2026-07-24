// Strategy Pattern Client
// Demonstrates switching between different algorithms at runtime

public class StrategyClient {
    public static void main(String[] args) {
        System.out.println("=== Strategy Pattern ===");

        ShoppingCart cart = new ShoppingCart(99.99);

        // Payment with Credit Card
        System.out.println("\n--- Payment Method 1: Credit Card ---");
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout();

        // Payment with PayPal
        System.out.println("\n--- Payment Method 2: PayPal ---");
        cart.setPaymentStrategy(new PayPalPayment("john@example.com"));
        cart.checkout();

        // Payment with Cryptocurrency
        System.out.println("\n--- Payment Method 3: Cryptocurrency ---");
        cart.setPaymentStrategy(new CryptoCurrencyPayment("1A1z7agoat2YLZW51Cc5ScT3633WetX3CW", "Bitcoin"));
        cart.checkout();

        // Different cart amounts
        System.out.println("\n=== Different Transaction Amounts ===");
        testPayment(50.00, new CreditCardPayment("4111-1111-1111-1111", "Jane Smith"));
        testPayment(150.75, new PayPalPayment("jane@example.com"));
        testPayment(200.00, new CryptoCurrencyPayment("3J98t1WpEZ73CNmYviecrnyiWrnqRhWNLy", "Ethereum"));
    }

    private static void testPayment(double amount, PaymentStrategy strategy) {
        ShoppingCart cart = new ShoppingCart(amount);
        cart.setPaymentStrategy(strategy);
        cart.checkout();
    }
}
