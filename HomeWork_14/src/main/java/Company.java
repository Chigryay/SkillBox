import javax.annotation.processing.Completion;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    private final ArrayList<Employee> employees;

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
    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getClass() + ", Salary - " + employee.getMonthSalary());
            if (employee instanceof Manager) System.out.println("Income Manager - " + ((Manager) employee).INCOME);
        }
        System.out.println(getIncome());
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return employees;
    }



    // TODO: 1. Реализовать компаратор для списка по з.п
}
