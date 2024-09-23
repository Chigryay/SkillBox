package practice;

import net.sf.saxon.expr.parser.Loc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 2023;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        StringBuilder builder = new StringBuilder();

        LocalDate now = LocalDate.now();
        LocalDate dateMyBirthday = LocalDate.of(year, month, day);
        LocalDate res;

        for (int i = 0; i <= now.getYear() - dateMyBirthday.getYear(); i++) {
            Locale en = Locale.ENGLISH;
            res = dateMyBirthday.plusYears(i);

            if (res.isAfter(now)) {
                builder.append("");
            }
            else
                builder.append(res.format(DateTimeFormatter.ofPattern(i + " - dd.MM.yyyy - E" , en))).append('\n');

        }
        return builder.toString();
    }
}
