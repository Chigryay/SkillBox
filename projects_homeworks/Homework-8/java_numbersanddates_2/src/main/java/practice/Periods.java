package practice;

import java.time.LocalDate;

public class Periods {

    // реализуйте вывод разницы между датами, используя класс Period
    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {

        return  "years:" + Math.abs(secondDate.getYear() - firstDate.getYear()) +
                ", months:" + Math.abs(secondDate.getMonthValue() - firstDate.getMonthValue()) +
                ", days:" + Math.abs(secondDate.getDayOfMonth() - firstDate.getDayOfMonth());
    }

}
