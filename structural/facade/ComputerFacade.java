// Facade - Simplified interface to complex subsystem

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    // Simplified interface methods
    public void startComputer() {
        System.out.println("[Computer Starting]\n");
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("\n[Computer Started Successfully]\n");
    }

    public void shutdownComputer() {
        System.out.println("[Computer Shutting Down]\n");
        cpu.stop();
        memory.reset();
        hardDrive.write();
        System.out.println("\n[Computer Shutdown Complete]\n");
    }
}
