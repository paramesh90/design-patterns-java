// Template Method Pattern
// Purpose: Define algorithm skeleton in base class
// Use Cases: Data processing pipelines, Framework templates

public abstract class DataProcessor {
    // Template method
    public final void process() {
        readData();
        validateData();
        transformData();
        saveData();
    }

    protected abstract void readData();
    protected abstract void validateData();
    protected abstract void transformData();
    protected abstract void saveData();
}
