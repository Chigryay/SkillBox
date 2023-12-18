import java.util.Comparator;

public class SortByMonthSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getMonthSalary() == o2.getMonthSalary()) return 0;
        else if (o1.getMonthSalary() < o2.getMonthSalary()) return -1;
        else return 1;
    }
}
