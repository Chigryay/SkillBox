package app;

import lombok.*;

import java.time.LocalDate;
import java.util.Objects;
@ToString
@Data
@AllArgsConstructor
public class Employee {
    @Setter @Getter String name;
    @Setter @Getter Integer salary;
    @Setter @Getter LocalDate workStart;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(salary, employee.salary) &&
                Objects.equals(workStart, employee.workStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, workStart);
    }

}
