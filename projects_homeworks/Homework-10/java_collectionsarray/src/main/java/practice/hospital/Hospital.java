package practice.hospital;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Hospital {
    private final static float maxTemp = 42.1f;
    private final static float minTemp = 31.9f;
    private static final StringBuilder stringBuilder = new StringBuilder();
    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] arr = new float[patientsCount];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) Math.round(new Random().nextFloat(minTemp, maxTemp) * 10) / 10;
        }
        return arr;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

        float averageTemp = 0;
        int count = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            averageTemp += temperatureData[i];
            stringBuilder.append(temperatureData[i]).append(" ");
            if (temperatureData[i] >= 36.2 && temperatureData[i] <= 36.9) {
                count++;
            }
        }

        averageTemp = (float) Math.round((averageTemp / temperatureData.length) * 100) / 100;
        String report =
            "Температуры пациентов: " + stringBuilder.toString().trim() +
            "\nСредняя температура: " + averageTemp +
            "\nКоличество здоровых: " + count;

        return report;
    }
}
