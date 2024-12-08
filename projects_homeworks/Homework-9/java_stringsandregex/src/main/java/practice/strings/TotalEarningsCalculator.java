package practice.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalEarningsCalculator {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль

    int count = 0;
    Matcher matcher = Pattern.compile("\\d+").matcher(text);

    while (matcher.find()) {
      count += Integer.parseInt(matcher.group());
    }
    System.out.println(count);
  }

}