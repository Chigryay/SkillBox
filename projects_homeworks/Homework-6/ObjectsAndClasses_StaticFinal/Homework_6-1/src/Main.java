public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("AMD");
        computer.setCpu(new CPU(3.7, 4, TypeCPU.INTEL, 300.0));
        computer.setKeyboard(new Keyboard(TypeKeyboard.MEMBRANE, 100));
        computer.setOzu(new OZU(TypeOZU.DDR4, 16, 50));
        computer.setScreenMonitor(new ScreenMonitor(TypeMonitor.IPS, 24, 150));
        computer.setSourceForInformation(new SourceForInformation(TypeSource.SSD, 250, 200));

        System.out.println(computer);
    }
}