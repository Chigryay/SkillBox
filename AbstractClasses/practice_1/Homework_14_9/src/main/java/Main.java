import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        List<Employee> employees = company.employees;

        for (int i = 0; i < 180; i++) {
            employees.add(new Manager(company));
        }

        for (int i = 0; i < 80; i++) {
            employees.add(new Operator(company));
        }

        for (int i = 0; i < 10; i++) {
            employees.add(new TopManager(company));
        }

        employees = company.getTopSalaryStaff(10);
        employees.forEach(System.out::println);

        System.out.println(company.companyProfit);
    }
}
