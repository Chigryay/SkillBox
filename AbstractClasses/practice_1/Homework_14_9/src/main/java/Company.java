import java.util.*;
import java.util.stream.Stream;

public class Company {

    private final List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public Company() {
        employees = new ArrayList<>();
    }

    protected double companyIncome = 0;

    public void hire(Employee employee) {
        employees.add(employee);
        companyIncome += calculateIncome(employee);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public void hireAll(ArrayList<Employee> anotherEmployees) {
        employees.addAll(anotherEmployees);
        for (Employee employee : anotherEmployees) {
            companyIncome += calculateIncome(employee);
        }
    }

    public double getIncome() {
        return companyIncome;
    }

    private double calculateIncome(Employee employee) {
        if (employee instanceof Manager) {
            return ((Manager) employee).INCOME;
        } else {
            return 0;
        }
    }

    public List<Employee> getLowSalaryStaff(int count) {
        return employees
                .stream()
                .sorted(Comparator.comparing(Employee::getMonthSalary))
                .limit(count)
                .toList();
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return employees
                .stream()
                .sorted(Comparator.comparing(Employee::getMonthSalary)
                .reversed())
                .limit(count)
                .toList();
    }
}
