package org.example.ParseFiles;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ParseFiles {
    public static String parseCsvToPojo(Object pojoClass, Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        return "";

    }
    public static void parseJsonToPojo(Path path) throws IOException {
        String lines = readJsonAndCsvFile(path);
        ObjectMapper mapper = new ObjectMapper();
        Object pojoClass = mapper.readValue(lines, Object.class);
        System.out.println(pojoClass);
    }
    private static String readJsonAndCsvFile(Path path) throws IOException {
        return Files.readString(path);
    }

}
