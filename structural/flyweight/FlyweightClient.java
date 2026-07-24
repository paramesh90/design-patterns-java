// Flyweight Pattern Client

public class FlyweightClient {
    public static void main(String[] args) {
        System.out.println("=== Flyweight Pattern ===");

        System.out.println("\n--- Creating and Reusing Vehicles ---");
        Vehicle car1 = VehicleFactory.getVehicle("Tesla", "Red");
        car1.drive("Market");

        Vehicle car2 = VehicleFactory.getVehicle("BMW", "Blue");
        car2.drive("Airport");

        Vehicle car3 = VehicleFactory.getVehicle("Tesla", "Red");
        car3.drive("Office");

        Vehicle car4 = VehicleFactory.getVehicle("Mercedes", "Black");
        car4.drive("Hotel");

        Vehicle car5 = VehicleFactory.getVehicle("BMW", "Blue");
        car5.drive("Station");

        System.out.println();
        VehicleFactory.showPoolSize();

        System.out.println("\n--- Verification ---");
        System.out.println("car1 == car3 (same Tesla-Red): " + (car1 == car3));
        System.out.println("car2 == car5 (same BMW-Blue): " + (car2 == car5));
    }
}
