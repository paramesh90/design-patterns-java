// Command Pattern Client

public class CommandClient {
    public static void main(String[] args) {
        System.out.println("=== Command Pattern ===");

        // Create receivers
        Light livingRoomLight = new Light("Living Room");
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        // Create commands
        Command livingRoomOn = new LightOnCommand(livingRoomLight);
        Command livingRoomOff = new LightOffCommand(livingRoomLight);
        Command bedroomOn = new LightOnCommand(bedroomLight);
        Command bedroomOff = new LightOffCommand(bedroomLight);
        Command kitchenOn = new LightOnCommand(kitchenLight);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Execute commands
        System.out.println("\n--- Executing Commands ---");
        remote.executeCommand(livingRoomOn);
        remote.executeCommand(bedroomOn);
        remote.executeCommand(kitchenOn);

        System.out.println("\n--- Undoing Last Command ---");
        remote.undoLastCommand();

        System.out.println("\n--- Executing More Commands ---");
        remote.executeCommand(livingRoomOff);
        remote.executeCommand(bedroomOff);

        System.out.println("\n--- Undo Multiple Times ---");
        remote.undoLastCommand();
        remote.undoLastCommand();

        System.out.println("\n--- Undo All ---");
        remote.undoAll();
    }
}
