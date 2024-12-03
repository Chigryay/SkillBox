package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrucksAndContainers {

    private static int finalCountCar = 1;
    private static int finalCountContainers = 1;

    private final static int COUNT_BOXES_IN_CONTAINERS = 27;
    private final static int COUNT_CONTAINERS_IN_CAR = 12;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        System.out.println("Сколько ящиков?");

        int countBoxes = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= countBoxes;) {

            finalCountCar = getCountCar();

            if (finalCountContainers % COUNT_CONTAINERS_IN_CAR - 1 == 0)
                System.out.println("Грузовик: " + finalCountCar);
            System.out.println("\tКонтейнер: " + finalCountContainers);

            for (int j = 1; j <= COUNT_BOXES_IN_CONTAINERS && i <= countBoxes; j++) {

                System.out.println("\t\tЯщик: " + i);
                i++;
            }

            finalCountContainers = i > countBoxes ?
                    finalCountContainers :
                    finalCountContainers + 1;
        }
        System.out.printf("Необходимо:\nгрузовиков - %d шт.\nконтейнеров - %d шт.",
                finalCountCar, finalCountContainers);
    }

    private static int getCountCar() {
        return finalCountContainers > COUNT_CONTAINERS_IN_CAR ?
                finalCountCar + 1 :
                finalCountCar;
    }

}
