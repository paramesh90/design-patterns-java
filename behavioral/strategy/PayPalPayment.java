// Concrete Strategy: PayPal Payment

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("Email: " + email);
        System.out.println("Payment successful via PayPal!");
    }

    @Override
    public String getMethodName() {
        return "PayPal";
    }
}
