// Concrete Handler: Manager

public class Manager extends Handler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getAmount() <= 10000;
    }

    @Override
    protected void process(Request request) {
        System.out.println("Manager: Approving request for $" + request.getAmount());
    }
}
