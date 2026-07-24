// Concrete Flyweight

public class Car implements Vehicle {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void drive(String destination) {
        System.out.println("Driving " + color + " " + model + " to " + destination);
    }
}
