// Facade Pattern Client

public class FacadeClient {
    public static void main(String[] args) {
        System.out.println("=== Facade Pattern ===");

        ComputerFacade computer = new ComputerFacade();

        // Start computer using simplified facade interface
        computer.startComputer();

        System.out.println("[Computer is running]\n");

        // Shutdown computer using simplified facade interface
        computer.shutdownComputer();

        System.out.println("--- Without Facade (Complex) ---\n");
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        System.out.println("Starting computer the hard way...");
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("\nComputer started!\n");

        System.out.println("Shutting down computer the hard way...");
        cpu.stop();
        memory.reset();
        hardDrive.write();
        System.out.println("\nComputer shutdown!");
    }
}
