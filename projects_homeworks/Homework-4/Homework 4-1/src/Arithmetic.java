public class Arithmetic {
    private final double num1;
    private final double num2;

    public Arithmetic(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum() {
        return num1 + num2;
    }

    public double multiplication() {
        return num1 * num2;
    }

    public double isMax() {
        return Double.max(num1, num2);
    }

    public double isMin() {
        return Double.min(num1, num2);
    }
}
