public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator(4, 0, Operation.DIVISION);
        System.out.println(calculator.getResult());
    }
}
