package cargo_information;

public class Dimensions {
    private final double length;
    private final double weight;
    private final double height;

    public Dimensions(double length, double weight, double height) {
        this.length = length;
        this.weight = weight;
        this.height = height;
    }

    public double getDimensions() {
        return length * weight * height;
    }

    @Override
    public String toString() {
        return String.valueOf(getDimensions());
    }
}
