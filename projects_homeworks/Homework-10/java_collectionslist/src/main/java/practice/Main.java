package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) throws IOException {
        // TODO: написать консольное приложение для работы со списком дел todoList
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        while (!input.equals("0")) {
            String regex = "add|edit|delete|list";
            String command = "";
            String todo = "";
            int index = 0;

            if (!input.isEmpty()) {
                String[] commands = input.split(" ");
                command = commands[0];

                if (command.matches(regex)) {
                    if (commands.length > 1) {
                        todo = input.split(" ", 2)[1];
                        String[] textAfterCommand = todo.split(" ", 2);
                        if (textAfterCommand.length > 1) {
                            try {
                                index = Integer.parseInt(textAfterCommand[0]);
                                todo = textAfterCommand[1];
                            } catch (NumberFormatException ex) {
                                todo = todo;
                            }
                        }
                    }
                }

                switch (command) {
                    case "add" -> {
                        if (input.split(" ").length > 1) todoList.add(index, todo);
                        else todoList.add(todo);
                    }
                    case "edit" -> todoList.edit(index, todo);
                    case "delete" -> todoList.delete(index);
                    case "list" -> {
                        for (int i = 0; i < todoList.getToDoList().size(); i++) {
                            System.out.println(i + " - " + todoList.getToDoList().get(i));
                        }
                    }
                }
            }
            input = reader.readLine();
        }

    }


}
