// Vending Machine Context

public class VendingMachine {
    private State currentState;
    private double balance = 0;
    private String selectedProduct;

    public VendingMachine() {
        this.currentState = new NoMoneyState();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(this, amount);
    }

    public void selectProduct(String product) {
        currentState.selectProduct(this, product);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct(this);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setSelectedProduct(String product) {
        this.selectedProduct = product;
    }

    public String getSelectedProduct() {
        return selectedProduct;
    }
}
