record OZU (TypeOZU typeOZU, int volume, double weight) {
    @Override
    public String toString() {
        return "typeOZU=" + typeOZU +
                ", volume=" + volume +
                ", weight=" + weight;
    }
}
enum TypeOZU {
    DDR3,
    DDR4
}
