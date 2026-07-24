// Chain of Responsibility Pattern
// Purpose: Pass request along a chain of handlers
// Use Cases: Event handling, Request processing, Logging chains

public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (canHandle(request)) {
            process(request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("End of chain - Request not handled: " + request.getType());
        }
    }

    protected abstract boolean canHandle(Request request);
    protected abstract void process(Request request);
}
