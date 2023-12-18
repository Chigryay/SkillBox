import java.math.BigDecimal;
import java.util.Random;

public class Manager implements Employee{
    public final double INCOME = generationIncome();
    private double monthSalary;
    @Override
    public double getMonthSalary() {
        return monthSalary;
    }
    public Manager() {
        calculateMonthSalary();
    }
    private double calculateMonthSalary() {
        double percent = 0.05;
        double baseSalary = 10_000;
        monthSalary = baseSalary + INCOME * percent;
        return monthSalary;
    }
    double generationIncome() {
        Random random = new Random();
        BigDecimal result = BigDecimal.valueOf(random.nextDouble(115_000, 140_000) + 1);
        return Double.parseDouble(String.valueOf(result));
    }
}
