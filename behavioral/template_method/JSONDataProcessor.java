// Concrete Implementation: JSON Data Processor

public class JSONDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading JSON data from API...");
    }

    @Override
    protected void validateData() {
        System.out.println("Validating JSON schema...");
    }

    @Override
    protected void transformData() {
        System.out.println("Transforming JSON to objects...");
    }

    @Override
    protected void saveData() {
        System.out.println("Saving data to data warehouse...");
    }
}
