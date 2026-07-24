// Context class that uses Strategy

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout() {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method!");
            return;
        }
        System.out.println("\n--- Checkout with " + paymentStrategy.getMethodName() + " ---");
        paymentStrategy.pay(totalAmount);
    }
}
