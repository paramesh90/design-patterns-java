// Flyweight Factory

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static final Map<String, Vehicle> vehicles = new HashMap<>();

    public static Vehicle getVehicle(String model, String color) {
        String key = model + "-" + color;

        if (!vehicles.containsKey(key)) {
            vehicles.put(key, new Car(model, color));
            System.out.println("Creating new vehicle: " + key);
        } else {
            System.out.println("Reusing existing vehicle: " + key);
        }

        return vehicles.get(key);
    }

    public static void showPoolSize() {
        System.out.println("Total vehicles in pool: " + vehicles.size());
    }
}
