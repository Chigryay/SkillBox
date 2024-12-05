package practice;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class Periods {

    // реализуйте вывод разницы между датами, используя класс Period
    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {

        String years =  "years:" + ChronoUnit.YEARS.between(firstDate,
                secondDate);
        secondDate = secondDate.minusYears(secondDate.getYear() - firstDate.getYear());
        String month =  "months:" + ChronoUnit.MONTHS.between(firstDate, secondDate);
        String days = "days:" + ChronoUnit.DAYS.between(firstDate, secondDate);

        return years + ", " + month + ", " + days;
    }



}
