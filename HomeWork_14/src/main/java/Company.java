import java.util.ArrayList;

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
    // TODO: 1. Сделать вывод список топ высоких з.п и топ низких з.п.
    //       2. реализовать уольнене сотрудников.
}
