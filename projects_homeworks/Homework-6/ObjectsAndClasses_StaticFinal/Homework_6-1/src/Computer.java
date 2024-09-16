public class Computer {

    private static double totalWeight;

    private OZU ozu;
    private CPU cpu;
    private SourceForInformation sourceForInformation;
    private ScreenMonitor screenMonitor;
    private Keyboard keyboard;
    private final String vendor;

    public Computer(String vendor) {
        this.vendor = vendor;
    }

    private double calculateTotalWeight() {
        return (ozu != null ? ozu.weight() : 0) + (cpu != null ? cpu.weight() : 0) +
                (screenMonitor != null ? screenMonitor.weight() : 0) +
                (sourceForInformation != null ? sourceForInformation.weight() : 0)
                + (keyboard != null ? keyboard.weight() : 0);
    }

    public void setOzu(OZU ozu) {
        this.ozu = ozu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSourceForInformation(SourceForInformation sourceForInformation) {
        this.sourceForInformation = sourceForInformation;
    }

    public void setScreenMonitor(ScreenMonitor screenMonitor) {
        this.screenMonitor = screenMonitor;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer{" + '\n' +
                "ozu=" + ozu + '\n' +
                ", cpu=" + cpu + '\n' +
                ", sourceForInformation=" + sourceForInformation + '\n' +
                ", screenMonitor=" + screenMonitor + '\n' +
                ", keyboard=" + keyboard + '\n' +
                ", vendor='" + vendor + '\'' + '\n' +
                "Total weight = " + calculateTotalWeight() +
                '}';
    }
}
