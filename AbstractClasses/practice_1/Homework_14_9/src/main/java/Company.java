import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Company {
    protected double companySalary = 15_000;
    protected double companyProfit = 0;
    public ArrayList<Employee> employees;
    public Company() {
        employees = new ArrayList<>();
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(Collection<Employee> someEmployees) {
         employees.addAll(someEmployees);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public double getCompanyProfit() {
        return companyProfit;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getMonthSalary).reversed())
                .limit(count)
                .toList();
    }

    public List<Employee> getLowSalaryStaff(int count) {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getMonthSalary))
                .limit(count)
                .toList();
    }
}
