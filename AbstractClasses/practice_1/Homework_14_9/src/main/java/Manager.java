import java.util.Random;
import java.util.stream.Stream;

public class Manager implements Employee {
    private final double companySalary;

    public double getManagerProfit() {
        return managerProfit;
    }

    private final double managerProfit;
    private double companyProfit;
    public Manager(Company company) {
        this.companySalary = company.companySalary;
        managerProfit = resultManagerProfit();
        company.companyProfit += managerProfit;
    }

    private double resultManagerProfit() {
        int maxProfit = 144_000;
        int minProfit = 115_000;
        return rnd(minProfit, maxProfit);
    }

    @Override
    public double getMonthSalary() {
        double percent = 0.05;
        return companySalary + managerProfit * percent;
    }

    private double rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "companySalary=" + getMonthSalary() +
                '}';
    }
}
