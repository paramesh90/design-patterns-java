// Existing incompatible interface (Legacy code)
// We need to adapt this to PaymentProcessor interface

public class LegacyPaymentGateway {
    public void makePayment(float paymentAmount) {
        System.out.println("Legacy Gateway: Processing payment of $" + paymentAmount);
    }

    public String getTransactionNumber() {
        return "TXN-" + System.currentTimeMillis();
    }
}
