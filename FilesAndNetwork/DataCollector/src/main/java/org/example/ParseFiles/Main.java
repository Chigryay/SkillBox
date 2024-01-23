package org.example.ParseFiles;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path depths_1_json = Paths.get("src/main/java/org/example/data/2/4/depths-1.json");
        Path depths_2_json = Paths.get("src/main/java/org/example/data/7/1/depths-2.json");
        Path depths_3_json = Paths.get("src/main/java/org/example/data/4/6/depths-3.json");

        System.out.println(ParseFiles.parseJsonToPojo(depths_1_json));
        System.out.println(ParseFiles.parseJsonToPojo(depths_2_json));
        System.out.println(ParseFiles.parseJsonToPojo(depths_3_json));


        Path dates_1_csv = Paths.get("src/main/java/org/example/data/4/6/dates-1.csv");
        Path dates_2_csv = Paths.get("src/main/java/org/example/data/0/5/dates-2.csv");
        Path dates_3_csv = Paths.get("src/main/java/org/example/data/9/6/dates-3.csv");

        System.out.println(ParseFiles.parseCsvToPojo(dates_1_csv));
        System.out.println(ParseFiles.parseCsvToPojo(dates_2_csv));
        System.out.println(ParseFiles.parseCsvToPojo(dates_3_csv));

    }
}
