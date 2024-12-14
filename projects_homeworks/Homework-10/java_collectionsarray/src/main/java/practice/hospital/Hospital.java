package practice.hospital;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Hospital {

    public static final float MIN_TEMP = 32.0f;
    public static final float MAX_TEMP = 40.0f;
    public static final float HEALTHY_TEMP = 37.0f;

    private float averageTemp;
    private List<Float> healthyPersons;
    private final float[] temperatureData;

    public Hospital(int countPerson) {
        healthyPersons = new ArrayList<>();
        temperatureData = new float[countPerson];
    }

    public String getReport() {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < temperatureData.length; i++) {
            temperatureData[i] = tempGeneration();
            healthyPersons = getHealthyPersons(temperatureData[i]);
            averageTemp += temperatureData[i];
        }

        averageTemp /= temperatureData.length;

        return builder.append("Температуры пациентов: ")
                .append(Arrays.toString(temperatureData))
                .append("\n")
                .append("Средняя температура: ")
                .append(String.format(Locale.ENGLISH, "%.2f", averageTemp))
                .append("\n")
                .append("Количество здоровых: ")
                .append(healthyPersons.size())
                .toString();
    }

    private  List<Float> getHealthyPersons(float temp) {
        if (isHealthy(temp)) {
            healthyPersons.add(temp);
        }
        return healthyPersons;
    }

    private boolean isHealthy(float temp) {
        return temp >= MIN_TEMP && temp < HEALTHY_TEMP;
    }

    private float tempGeneration() {
        float rndTempValue = (float) Math.random() * (MAX_TEMP - MIN_TEMP + 1) + MIN_TEMP;

        DecimalFormatSymbols symbol = new DecimalFormatSymbols(Locale.ENGLISH);
        DecimalFormat decimalFormat = new DecimalFormat("#.#", symbol);
        try {
            rndTempValue = Float.parseFloat(decimalFormat.format(rndTempValue));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rndTempValue;
    }

}
