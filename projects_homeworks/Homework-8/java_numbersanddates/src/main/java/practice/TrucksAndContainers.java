package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //получение количество коробок от пользователя
        int countBoxes = Integer.parseInt(reader.readLine());
        int countTrucks = 1;
        int countContainers = 1;
        final int MAX_COUNT_CONTAINERS_IN_THE_TUCK = 12;
        final int MAX_COUNT_BOXES_IN_THE_CONTAINER = 27;

        System.out.println("Грузовик: " + countTrucks);

        for (int i = 1; i <= countBoxes; ) {

            if (countContainers % (MAX_COUNT_CONTAINERS_IN_THE_TUCK + 1) == 0)
                System.out.println("Грузовик: " + countTrucks);

            System.out.println("\tКонтейнер: " + countContainers);
            for (int j = 1; j <= MAX_COUNT_BOXES_IN_THE_CONTAINER && i <= countBoxes; j++) {
                countContainers = i % 27 == 0 ?
                        countContainers + 1 :
                        countContainers;

                System.out.println("\t\tЯщик: " + i);
                i++;
            }

            countTrucks = countContainers % MAX_COUNT_CONTAINERS_IN_THE_TUCK == 0 ?
                    countTrucks + 1 :
                    countTrucks;



        }

        System.out.println("Необходимо:\nгрузовиков - " + countTrucks +
                " шт.\nконтейнеров - " +
                countContainers + " шт.");

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
