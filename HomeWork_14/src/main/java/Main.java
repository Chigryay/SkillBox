import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Company company_1 = new Company();
        for (int i = 0; i < 2; i++) {
            company_1.hire(new Manager());
        }
        for (int i = 0; i < 2; i++) {
            company_1.hire(new TopManager(company_1));
        }
        company_1.printEmployees();
    }
}
