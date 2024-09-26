package practice.regex;

import java.beans.PropertyEditorSupport;
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
    String regex = "^\\+?(7|8)?\\W?[(]?\\d{3}[)]?\\W?\\d{3}\\W?\\W?\\d{2}\\W?\\d{2}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

    if (!input.matches(regex)) {
      return "Неверный формат номера";
    }
    while (matcher.find()) {
      input = matcher.group().replaceAll("[\\W+)]", "");
      input = input.length() < 11 ?
              "7".concat(input) :
              input.replaceFirst("[+]?[7|8]", "7");
    }
    return input;
  }
}

