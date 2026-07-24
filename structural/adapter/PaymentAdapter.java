// Adapter - Adapts LegacyPaymentGateway to PaymentProcessor interface

public class PaymentAdapter implements PaymentProcessor {
    private LegacyPaymentGateway legacyGateway;

    public PaymentAdapter(LegacyPaymentGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Adapt from double to float
        legacyGateway.makePayment((float) amount);
    }

    @Override
    public String getTransactionId() {
        // Adapt getTransactionNumber to getTransactionId
        return legacyGateway.getTransactionNumber();
    }
}
