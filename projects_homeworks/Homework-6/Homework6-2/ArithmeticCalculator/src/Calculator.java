public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double calc(Operation operation) throws Exception {
        return switch (operation) {
            case ADD -> Double.sum(num1, num2);
            case MULTIPLY -> num1 * num2;
            case SUBTRACT -> num1 - num2;
            case DIVISION -> num1 / num2;
        };
    }
}
