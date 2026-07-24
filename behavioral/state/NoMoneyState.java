// Concrete State: No Money

public class NoMoneyState implements State {
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        machine.setBalance(amount);
        System.out.println("Money inserted: $" + amount);
        machine.setState(new MoneyInsertedState());
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        System.out.println("Please insert money first!");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("No product selected!");
    }
}
