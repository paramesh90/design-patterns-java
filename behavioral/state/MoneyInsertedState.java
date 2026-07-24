// Concrete State: Money Inserted

public class MoneyInsertedState implements State {
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        machine.setBalance(machine.getBalance() + amount);
        System.out.println("Money inserted: $" + amount + ". Current balance: $" + machine.getBalance());
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        machine.setSelectedProduct(product);
        System.out.println("Product selected: " + product);
        machine.setState(new ProductSelectedState());
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Please select a product!");
    }
}
