import java.util.Random;

public class Operator implements Employee {

    private double monthSalary;

    public Operator() {
        calculateMonthSalary();
    }

    @Override
    public double getMonthSalary() {
        return monthSalary;
    }

    private double calculateMonthSalary() {
        monthSalary = new Random().nextDouble(7000, 9000);
        return monthSalary;
    }
}
