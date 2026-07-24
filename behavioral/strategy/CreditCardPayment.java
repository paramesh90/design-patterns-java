// Concrete Strategy: Credit Card Payment

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Card: " + cardNumber + " | Holder: " + cardHolderName);
        System.out.println("Payment successful!");
    }

    @Override
    public String getMethodName() {
        return "Credit Card";
    }
}
