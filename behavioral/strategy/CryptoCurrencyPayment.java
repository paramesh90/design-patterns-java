// Concrete Strategy: Cryptocurrency Payment

public class CryptoCurrencyPayment implements PaymentStrategy {
    private String walletAddress;
    private String currencyType;

    public CryptoCurrencyPayment(String walletAddress, String currencyType) {
        this.walletAddress = walletAddress;
        this.currencyType = currencyType;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing " + currencyType + " payment of $" + amount);
        System.out.println("Wallet: " + walletAddress);
        System.out.println("Blockchain transaction initiated!");
    }

    @Override
    public String getMethodName() {
        return currencyType;
    }
}
