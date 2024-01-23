package org.example.ParseFiles;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ParseFiles {

    public static String parseCsvToPojo(Path path) throws IOException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)))) {
            CsvMapper mapper = new CsvMapper();
            String className = String.valueOf(path).replaceAll("^.+\\\\", "");
            className = className.replaceAll("\\.csv", "");
            className = className.substring(0, 1).toUpperCase() + className.substring(1)
                    .replace('-', '_');
            path = Path.of(Paths.get("org\\example\\ParseFiles")
                    .toString()
                    .replaceAll("\\\\", "."));

            Class<?> classType = Class.forName(path + "." + className);
            CsvSchema schema = mapper.schemaFor(classType)
                    .withColumnSeparator(',')
                    .withSkipFirstDataRow(true);

            MappingIterator<Object> iterator = mapper
                    .readerFor(Object.class)
                    .with(schema)
                    .readValues(reader);

            List<Object> elements = iterator.readAll();

            for (Object element : elements) {
                builder.append(element);
            }
//
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return builder.toString();
    }

    public static String parseJsonToPojo(Path path) throws IOException {
        String lines = readJsonFile(path);
        ObjectMapper mapper = new ObjectMapper();
        Object pojoClass = mapper.readValue(lines, Object.class);
        return pojoClass.toString();
    }

    private static String readJsonFile(Path path) throws IOException {
        return Files.readString(path);
    }

}
