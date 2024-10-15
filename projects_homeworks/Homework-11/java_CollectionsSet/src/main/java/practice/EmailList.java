package practice;

import java.util.ArrayList;
import java.util.List;

public class EmailList {

    private final List<String> emailList = new ArrayList<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        String regex = "^\\w+@[a-z]+\\.[a-z]{2,}+$";
        if (email.matches(regex))
            emailList.add(email.toLowerCase());
        else
            System.out.println(Main.WRONG_EMAIL_ANSWER);
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return emailList.stream()
                        .sorted()
                        .distinct()
                        .toList();
    }
}
