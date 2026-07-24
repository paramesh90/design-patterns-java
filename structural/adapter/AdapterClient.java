// Adapter Pattern Client

public class AdapterClient {
    public static void main(String[] args) {
        System.out.println("=== Adapter Pattern ===");

        // Using the adapter to make legacy gateway compatible
        LegacyPaymentGateway legacyGateway = new LegacyPaymentGateway();
        PaymentProcessor processor = new PaymentAdapter(legacyGateway);

        System.out.println("\n--- Processing Payment with Adapter ---");
        processor.processPayment(99.99);
        System.out.println("Transaction ID: " + processor.getTransactionId());

        System.out.println("\n--- Multiple Payments ---");
        double[] amounts = {50.00, 150.75, 200.00};
        for (double amount : amounts) {
            PaymentProcessor payment = new PaymentAdapter(new LegacyPaymentGateway());
            payment.processPayment(amount);
            System.out.println("Transaction ID: " + payment.getTransactionId());
        }
    }
}
