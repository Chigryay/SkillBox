package org.example.ParseFiles;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import javax.lang.model.element.Element;
import javax.management.remote.SubjectDelegationPermission;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

public class ParseFiles {
    public static void parseCsvToPojo(Path path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)))) {
            CsvMapper mapper = new CsvMapper();
            String className = String.valueOf(path).replaceAll("^.+\\\\", "");
            className = className.replaceAll("\\.csv", "");
            String capitalizedClassName = className.substring(0, 1).toUpperCase() + className.substring(1);
            CsvSchema schema = mapper.schemaFor(Object.class)
                    .withColumnSeparator(',')
                    .withSkipFirstDataRow(true);
            MappingIterator<Object> iterator = mapper
                    .readerFor(Object.class)
                    .with(schema)
                    .readValues(reader);

            List<Object> elements = iterator.readAll();

            for (Object element : elements) {
                System.out.println(element.toString());
            }
            System.out.println(Dates_2.class);
        }
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
