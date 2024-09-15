public record CargoInformation(Dimensions dimensions, double weight, String address, Boolean isRotate,
                               String regNumber, Boolean isFragile) {

    public CargoInformation setAddress(String address) {
        return new CargoInformation(dimensions, weight, address, isRotate, regNumber, isFragile);
    }

    public CargoInformation setWeight(double weight) {
        return new CargoInformation(dimensions, weight, address, isRotate, regNumber, isFragile);
    }

    public CargoInformation setDimensions(Dimensions dimensions) {
        return new CargoInformation(dimensions, weight, address, isRotate, regNumber, isFragile);
    }

    @Override
    public String toString() {
        return "CargoInformation = {"  +
                "dimensions= " + dimensions.volumeCalculation() + '\n' +
                ", weight= " + weight + '\n' +
                ", address= " + address + '\n' +
                ", isRotate=" + isRotate +
                ", regNumber= " + regNumber + '\n' +
                ", isFragile= " + isFragile +
                '}';
    }
}
