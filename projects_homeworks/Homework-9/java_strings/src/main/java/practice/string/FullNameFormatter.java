package practice.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullNameFormatter {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }

      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
      String regEx = "^([A-Za-zА-Яа-я]+)\\s+([A-Za-zА-Яа-я]+)\\s([A-Za-zА-Яа-я]+)$";
      Matcher matcher = Pattern.compile(regEx).matcher(input);

      while (matcher.find()) {
        for (int count = 1; count <= matcher.groupCount(); count++) {
          switch (count) {
            case 1 -> System.out.printf("Фамилия: %s\n", matcher.group(count));
            case 2 -> System.out.printf("Имя: %s\n", matcher.group(count));
            case 3 -> System.out.printf("Отчество: %s\n", matcher.group(count));
          }
        }
      }
    }
  }
}