package practice.collections.collectionsSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class MailBook {
    public static void main(String[] args) throws IOException {
        Set<MailAddress> mailList = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equals("0")) {
                break;
            }
            if (input.length > 2) {
                System.out.println("error command");
                continue;
            } else {
                String command = input[0];
                String mail = "";


                switch (command) {
                    case "add" -> {
                        if (input[1].matches("^\\w+@[a-z]+\\.[a-z]{2,3}$")) {
                            mail = input[1];
                        }
                        mailList.add(new MailAddress(mail));
                        System.out.println("added mail " + mail);
                    }
                    case "list" -> mailList.forEach(System.out::println);
                }
            }
        }
    }
}
