// Concrete State: Product Selected

public class ProductSelectedState implements State {
    private static final double PRODUCT_PRICE = 1.50;

    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Product already selected. Press dispense button.");
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        System.out.println("Already a product selected!");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        if (machine.getBalance() >= PRODUCT_PRICE) {
            System.out.println("Dispensing: " + machine.getSelectedProduct());
            machine.setBalance(machine.getBalance() - PRODUCT_PRICE);
            System.out.println("Change: $" + machine.getBalance());
            machine.setState(new NoMoneyState());
        } else {
            System.out.println("Insufficient funds! Need $" + PRODUCT_PRICE);
        }
    }
}
