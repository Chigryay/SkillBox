public class Calculator {
    private final double num1;
    private final double num2;
    private Operation operation;
    private double result = 0;

    public Calculator(double num1, double num2, Operation operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        result = calculator(operation);
    }

    private double calculator(Operation operation) {
        switch (operation) {
            case Operation.ADD -> {
                result = num1 + num2;
            }
            case Operation.MULTIPLY -> {
                result = num1 * num1;
            }
            case Operation.DIVISION -> {
                try {
                    result = num1 / num2;
                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                }

            }
            case Operation.SUBTRACT -> {
                result = num1 - num2;
            }
        }
        return result;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }
}
