record ScreenMonitor(TypeMonitor typeMonitor, int drawing, double weight) {
    @Override
    public String toString() {
        return  "typeMonitor=" + typeMonitor +
                ", drawing=" + drawing +
                ", weight=" + weight;
    }
}
enum TypeMonitor {
    IPS,
    TN,
    VA
}
