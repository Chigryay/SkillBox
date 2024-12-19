package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        PhoneBook phoneBook = new PhoneBook();
        String input = "";

        while (!input.equals("0")) {
            System.out.println("Введите номер, имя или команду:");
            input = reader.readLine();
            String[] data = input.split(" ");
            if (data.length > 1) {
                String name = data[0], phone = data[1];
                phoneBook.addContact(name, phone);
            } else {
                String info = data[0];
                if (info.equals("list")) {
                    phoneBook.getAllContacts().forEach(System.out::println);
                } else if (isMatchesPhone(info)) {
                    phoneBook.getContactByPhone(info);
                } else if (isMatchesName(info)) {
                    phoneBook.getContactByName(info);

                } else System.out.println(PhoneBook.INVALID_FORMAT);
            }
        }
    }

    static boolean isMatchesPhone(String phone) {
        return phone.matches(PhoneBook.REGEX_FOR_PHONE);
    }

    static boolean isMatchesName(String name) {
        return name.matches(PhoneBook.REGEX_FOR_NAME);
    }
}
