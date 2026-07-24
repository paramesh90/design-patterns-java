// Invoker: Remote Control

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo");
        }
    }

    public void undoAll() {
        System.out.println("\nUndoing all commands...");
        while (!commandHistory.isEmpty()) {
            undoLastCommand();
        }
    }
}
