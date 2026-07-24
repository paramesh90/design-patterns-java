// Concrete Handler: Director

public class Director extends Handler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getAmount() <= 50000;
    }

    @Override
    protected void process(Request request) {
        System.out.println("Director: Approving request for $" + request.getAmount());
    }
}
