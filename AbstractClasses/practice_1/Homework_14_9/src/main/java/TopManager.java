public class TopManager implements Employee{

    private final double companySalary;
    private final double companyProfit;
    public TopManager(Company company) {
        this.companySalary = company.companySalary;
        this.companyProfit = company.getCompanyProfit();
    }

    public double getMonthSalary() {
        double percent = 1.5;
        return companyProfit >= 10_000_000 ?
                companySalary + companySalary * percent :
                companySalary;
    }

    @Override
    public String toString() {
        return "TopManager{" +
                "companySalary=" + getMonthSalary() +
                '}';
    }
}
