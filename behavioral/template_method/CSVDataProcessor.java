// Concrete Implementation: CSV Data Processor

public class CSVDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading CSV data from file...");
    }

    @Override
    protected void validateData() {
        System.out.println("Validating CSV format...");
    }

    @Override
    protected void transformData() {
        System.out.println("Transforming CSV data to objects...");
    }

    @Override
    protected void saveData() {
        System.out.println("Saving data to database...");
    }
}
