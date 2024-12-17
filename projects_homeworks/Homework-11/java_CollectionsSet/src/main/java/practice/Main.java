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
            if (input.equals("0")) {
                break;
            }

            String email = "";
            String regex = "[add|list]+";
            String command = input.split(" ")[0];
            int inputLength = input.split(" ").length;

            if (command.matches(regex) && inputLength <= 2) {
                if (inputLength > 1) {
                    email = input.split(" ")[1];
                }

                switch (command) {
                    case "add" -> emailList.add(email);
                    case "list" -> emailList.getSortedEmails().forEach(System.out::println);
                }
            }
        }
    }
}
