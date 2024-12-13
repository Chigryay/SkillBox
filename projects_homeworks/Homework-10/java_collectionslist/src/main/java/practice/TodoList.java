package practice;

import java.util.ArrayList;

public class TodoList {

    private final ArrayList<String> toDoList = new ArrayList<>();

    public ArrayList<String> getToDoList() {
        return toDoList;
    }

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        toDoList.add(todo);
        System.out.printf("Добавлено дело \"%s\"\n", todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (isHasIndex(index)) {
            toDoList.add(index, todo);
            System.out.printf("Добавлено дело \"%s\"\n", todo);
        }
        else
            add(todo);
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (isHasIndex(index)) {
            System.out.printf("Дело \"%s\" заменено на ", toDoList.get(index));
            toDoList.set(index, todo);
            System.out.printf("\"%s\"\n", todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (isHasIndex(index)) {
            toDoList.remove(index);
            System.out.printf("Дело \"%s\" удалено\n", toDoList.get(index));
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return toDoList;
    }

    private boolean isHasIndex(int index) {
        return index >= 0 && index < toDoList.size();
    }



}