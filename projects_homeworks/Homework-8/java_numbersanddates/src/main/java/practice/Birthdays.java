package practice;

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

        StringBuilder stringBuilder = new StringBuilder();
        LocalDate localDate = LocalDate.of(year, month, day);

        LocalDate nowBirthday = LocalDate.now();

        int i = 0;
        while (nowBirthday.getYear() != localDate.getYear() - 1) {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE")
                    .localizedBy(new Locale("us"));
            stringBuilder.append(i).append(" - ")
                        .append(formatter.format(localDate))
                    .append('\n');
            localDate = localDate.plusYears(1);

            if (nowBirthday.isBefore(localDate))
                break;
            i++;
        }

        return stringBuilder.toString();
    }
}
