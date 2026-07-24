// State Pattern Client

public class StateClient {
    public static void main(String[] args) {
        System.out.println("=== State Pattern ===");

        VendingMachine machine = new VendingMachine();

        System.out.println("\n--- Scenario 1: Successful Purchase ---");
        machine.insertMoney(2.0);
        machine.selectProduct("Soda");
        machine.dispenseProduct();

        System.out.println("\n--- Scenario 2: Insufficient Funds ---");
        machine.insertMoney(1.0);
        machine.selectProduct("Juice");
        machine.dispenseProduct();

        System.out.println("\n--- Scenario 3: Add More Money ---");
        machine.insertMoney(1.0);
        machine.dispenseProduct();

        System.out.println("\n--- Scenario 4: Invalid Operations ---");
        machine.selectProduct("Water");
        machine.insertMoney(2.0);
        machine.dispenseProduct();
    }
}
