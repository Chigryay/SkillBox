public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator(10, 0);
        System.out.println(calculator.calc(Operation.ADD));
        System.out.println(calculator.calc(Operation.MULTIPLY));
        System.out.println(calculator.calc(Operation.SUBTRACT));
        System.out.println(calculator.calc(Operation.DIVISION));
    }
}
