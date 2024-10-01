record CPU(double frequency, int numberOfCores, TypeCPU typeCPU, double weight) {
    @Override
    public String toString() {
        return "frequency=" + frequency +
                ", numberOfCores=" + numberOfCores +
                ", typeCPU=" + typeCPU +
                ", weight=" + weight;
    }
}
enum TypeCPU {
    INTEL,
    AMD
}
