record SourceForInformation(TypeSource typeSource, int volume, double weight) {
    @Override
    public String toString() {
        return "typeSource=" + typeSource +
                ", volume=" + volume +
                ", weight=" + weight;
    }
}
enum TypeSource {
    SSD,
    HDD
}
