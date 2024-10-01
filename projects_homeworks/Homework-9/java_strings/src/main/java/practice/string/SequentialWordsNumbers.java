package practice.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text) {
        StringBuilder builder = new StringBuilder();
        int count = 1;

        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            count++;
        }
        if (count > 1) {
            String[] arr = text.split(pattern.pattern());
            for (int i = 0; i < count; i++) {
                builder.append("(").append(i + 1).append(")").append(" ").append(arr[i]).append(" ");
            }
            return builder.toString().trim();
        } else
            return builder.toString();
    }

}
