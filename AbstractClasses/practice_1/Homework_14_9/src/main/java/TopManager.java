import java.util.Random;

public class TopManager implements Employee {

    private final Company company;

    private double monthSalary;

    public TopManager(Company company) {
        this.company = company;
        calculateMonthSalary();
    }

    private double calculateMonthSalary() {
        double baseSalary = new Random().nextDouble(20_000, 50_000);
        double percent = 1.5;
        monthSalary = company.companyIncome >= 10_000_000 ? baseSalary + baseSalary * percent
                : baseSalary;
        return monthSalary;
    }

    @Override
    public double getMonthSalary() {
        return monthSalary;
    }
}
