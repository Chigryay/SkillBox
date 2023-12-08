import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Company company_1 = new Company();
        for (int i = 0; i < 80; i++) {
            company_1.hire(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            company_1.hire(new TopManager(company_1));
        }
        for (int i = 0; i < 180; i++) {
            company_1.hire(new Operator());
        }
        System.out.println("full salary staff :");
        company_1.printEmployees(company_1.getEmployees());
        System.out.println("\nTop salary staff :");
        company_1.printEmployees(company_1.getTopSalaryStaff(15));
        System.out.println("\nLow salary staff :");
        company_1.printEmployees(company_1.getLowSalaryStaff(30));

        company_1.printEmployees(company_1.fire(3));
    }
}
