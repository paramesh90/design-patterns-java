// Adapter Pattern
// Purpose: Make incompatible interfaces compatible
// Use Cases: Legacy code integration, Third-party API integration, Database migration

// Target interface - what we want to use
public interface PaymentProcessor {
    void processPayment(double amount);
    String getTransactionId();
}
