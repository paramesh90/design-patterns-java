// State Pattern
// Purpose: Allows behavior change based on internal state
// Use Cases: State machines, Game states, Traffic lights

// State interface
public interface State {
    void insertMoney(VendingMachine machine, double amount);
    void selectProduct(VendingMachine machine, String product);
    void dispenseProduct(VendingMachine machine);
}
