package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmailList {
    private final List<String> emailList;

    public EmailList() {
        emailList = new ArrayList<>();
    }

    public void add(String email) {
        String regex = "^[^\\W|-|_]+@[A-Za-z]+\\.[A-Za-z]{2,3}";
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        if (email.matches(regex)) {
            emailList.add(email.toLowerCase());
            System.out.println("Email added " + email);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return emailList.stream()
                .sorted()
                .distinct()
                .toList();
    }

    public List<String> getEmailList() {
        return emailList;
    }
}
