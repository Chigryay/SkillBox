package practice;

import java.util.List;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        List<String> list = CoolNumbers.generateCoolNumbers();
        for (String number : list) {
            System.out.println(number);
        }
    }
}
