import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Manager implements Employee{
    public final double INCOME = generationIncome();
    @Override
    public double getMonthSalary() {
        double percent = 0.05;
        double baseSalary = 10_000;
        return baseSalary + INCOME * percent;
    }
    double generationIncome() {
        Random random = new Random();
        BigDecimal result = BigDecimal.valueOf(random.nextDouble(115_000, 140_000) + 1);
        return Double.parseDouble(String.valueOf(result.setScale(2, RoundingMode.HALF_DOWN)));
    }
}
