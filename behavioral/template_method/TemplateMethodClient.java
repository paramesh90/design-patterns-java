// Template Method Pattern Client

public class TemplateMethodClient {
    public static void main(String[] args) {
        System.out.println("=== Template Method Pattern ===");

        System.out.println("\n--- Processing CSV Data ---");
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process();

        System.out.println("\n--- Processing JSON Data ---");
        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.process();
    }
}
