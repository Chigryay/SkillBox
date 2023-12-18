package app;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = EmployeeUtils.loadStaffFromFile(STAFF_TXT);

        System.out.println(sumSalary(staff));
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
        //TODO Метод должен вернуть сотрудника с максимальной зарплатой среди тех,
        // кто пришёл в году, указанном в переменной year

        return staff
                .stream()
                .filter(e -> e.getWorkStart().getYear() == year)
                .max(Comparator.comparing(Employee::getSalary)).orElse(new Employee("", 0, LocalDate.now()));
    }
    public static double sumSalary(List<Employee> staff) {
        return staff.stream()
                .map(Employee::getSalary)
                .filter(e -> e > 100_000)
                .reduce(Integer::sum)
                .orElse(0);
    }
}