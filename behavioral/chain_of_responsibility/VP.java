// Concrete Handler: VP

public class VP extends Handler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getAmount() <= 100000;
    }

    @Override
    protected void process(Request request) {
        System.out.println("VP: Approving request for $" + request.getAmount());
    }
}
