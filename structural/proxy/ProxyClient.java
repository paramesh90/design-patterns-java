// Proxy Pattern Client

public class ProxyClient {
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern ===");

        System.out.println("\n--- Using Proxy (Lazy Loading) ---");
        Image proxyImage1 = new ProxyImage("photo1.jpg");
        Image proxyImage2 = new ProxyImage("photo2.jpg");
        Image proxyImage3 = new ProxyImage("photo3.jpg");

        System.out.println("Images created but not loaded yet.\n");

        System.out.println("Displaying first image:");
        proxyImage1.display();

        System.out.println("\nDisplaying first image again (already loaded):");
        proxyImage1.display();

        System.out.println("\nDisplaying second image:");
        proxyImage2.display();

        System.out.println("\n--- Direct Loading (Without Proxy) ---");
        System.out.println("Loading image directly:");
        Image realImage = new RealImage("photo4.jpg");
        realImage.display();
    }
}
