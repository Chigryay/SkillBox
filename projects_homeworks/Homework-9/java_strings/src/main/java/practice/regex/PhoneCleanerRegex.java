package practice.regex;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }

      // TODO:напишите ваш код тут, результат вывести в консоль.
      System.out.println(result(input));
    }
  }

  public static String result(String input) {

    String regex = "^\\+?[7|8|9]\\D?\\D?\\d{2,}\\D?\\D?\\d{3}\\D?\\d{2}\\D?\\d{2}$";
    String error = "Неверный формат номера";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

    if (!input.matches(regex)) {
      input = error;
    }

    while (matcher.find()) {
      input = matcher.group().replaceAll("\\D+", "");
      input = input.length() == 10 ?
              "7".concat(input) :
              input.length() == 11 && (input.charAt(0) == '7' || input.charAt(0) == '8') ?
                      input.replaceAll("8", "7") :
                      error;
    }

    return input;
  }
}
