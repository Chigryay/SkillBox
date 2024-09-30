package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) throws IOException {
        // TODO: написать консольное приложение для работы со списком дел todoList
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command;
        String textAfterCommand;

        String toDo = reader.readLine();
        while (!toDo.equals("exit")) {
            String regex = "^[LIST|ADD|EDIT|DELETE]+";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(toDo);

            // TODO реализовать бесеончный цикл с запросом команд и придумать способ засплитить строку по match.group
            while (matcher.find()) {
                command = toDo.split(" ", 2)[0];
                textAfterCommand = toDo.split(" ").length < 2 ?
                        command :
                        toDo.split(" ", 3)[1];

                switch (command) {
                    case "add" -> todoList.add(textAfterCommand);
                    case "edit" -> todoList.edit(Integer.parseInt(textAfterCommand.split(" ")[0]),
                            textAfterCommand.split(" ")[1]);
                    case "delete" -> todoList.delete(Integer.parseInt(textAfterCommand.split(" ")[0]));
                    case "list" -> todoList.getTodos().forEach(System.out::println);
                    default -> System.out.println("error");
                }
            }
            toDo = reader.readLine();
        }
    }
}
