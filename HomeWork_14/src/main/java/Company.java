import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

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
        if (employee instanceof Manager)
            return ((Manager) employee).INCOME;
        else return 0;
    }
    public void printEmployees(List<Employee> employees) {
        int id = 1;
        for (Employee employee : employees) {
            System.out.println("id - " + id + " | " + employee.getClass()
                    + " | Salary - " + employee.getMonthSalary());
            /*if (employee instanceof Manager) System.out.println("Income Manager - "
                    + ((Manager) employee).INCOME);*/
            id++;
        }
        System.out.println("Income - " + getIncome());
    }
    /* Доделать увольнение сотрудников */
    public List<Employee> fire(int count) {
        return employees.stream().map(employee -> employees::remove)
    }
    public List<Employee> getLowSalaryStaff(int count) {
        return employees.stream().sorted(Comparator.comparing(Employee::getMonthSalary))
                .limit(count).toList();
    }
    public List<Employee> getTopSalaryStaff(int count) {
        return employees.stream().sorted(Comparator.comparing(Employee::getMonthSalary).reversed())
                .limit(count).toList();
    }
}
