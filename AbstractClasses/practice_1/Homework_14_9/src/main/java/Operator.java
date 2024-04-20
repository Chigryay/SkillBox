public class Operator implements Employee{
    private final double companySalary;
    public Operator(Company company) {
        this.companySalary = company.companySalary;
    }
    public double getMonthSalary() {
        return companySalary;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "companySalary=" + getMonthSalary() +
                '}';
    }
}
