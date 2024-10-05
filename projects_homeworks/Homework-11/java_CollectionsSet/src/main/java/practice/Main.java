package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        EmailList emailList = new EmailList();
        while (true) {
            String input = reader.readLine();
            String command,
                    textEmail = "";

            if (input.equals("0")) {
                break;
            }

            if (input.split(" ").length <= 2) {
                command = getCommand(input);
                if (input.split(" ").length != 1)
                    textEmail = getTextEmail(input);
            } else {
                continue;
            }

            switch (command) {
                case "add" -> emailList.add(textEmail);
                case "list" -> emailList.getSortedEmails()
                        .forEach(System.out::println);
                default -> {
                    System.out.println("Неверная команда");
                }
            }
        }
    }
    private static String getCommand(String input) {
        return input.split(" ").length != 1 ?
                input.split(" ", 2)[0].toLowerCase() :
                input.split(" ")[0].toLowerCase();
    }
    private static String getTextEmail(String input) {
        return input.split(" ", 2)[1].toLowerCase();
    }
}
