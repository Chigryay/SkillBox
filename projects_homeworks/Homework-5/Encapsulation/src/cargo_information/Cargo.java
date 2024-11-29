package cargo_information;

public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean isRotate;
    private final String number;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, double weight, String address, boolean isRotate, String number, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.isRotate = isRotate;
        this.number = number;
        this.isFragile = fragile;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, address, isRotate, number, isFragile);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, address, isRotate, number, isFragile);
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, weight, address, isRotate, number, isFragile);
    }

    public Cargo setIsRotate(boolean isRotate) {
        return new Cargo(dimensions, weight, address, isRotate, number, isFragile);
    }

    public Cargo setNumber(String number) {
        return new Cargo(dimensions, weight, address, isRotate, number, isFragile);
    }

    public Cargo setIsFragile(boolean isFragile) {
        return new Cargo(dimensions, weight, address, isRotate, number, isFragile);
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "dimensions=" + dimensions +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                ", isRotate=" + isRotate +
                ", number='" + number + '\'' +
                ", isFragile=" + isFragile +
                '}';
    }
}
