public class TopManager implements Employee{
    private final Company company;
    public TopManager(Company company) {
        this.company = company;
    }
    @Override
    public double getMonthSalary() {
        double baseSalary = 40_000;
        double percent = 1.5;
        return company.companyIncome >= 10_000_000 ? baseSalary + baseSalary * percent
                : baseSalary;
    }
}
