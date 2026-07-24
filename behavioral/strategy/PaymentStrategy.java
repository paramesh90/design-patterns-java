// Strategy Pattern
// Purpose: Encapsulate interchangeable algorithms
// Use Cases: Payment methods, Sorting algorithms, Data compression, Report generation

// Strategy interface
public interface PaymentStrategy {
    void pay(double amount);
    String getMethodName();
}
