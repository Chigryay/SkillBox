package org.example.ParseFiles;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import javax.lang.model.element.Element;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

public class ParseFiles {
    public static void parseCsvToPojo(Path path) throws IOException {
        try (Reader reader = new FileReader(String.valueOf(path))) {
            CsvMapper mapper = new CsvMapper();
            CsvSchema schema = mapper.schemaFor(Element.class)
                    .withColumnSeparator(',')
                    .withSkipFirstDataRow(true);
            MappingIterator<Element> iterator = mapper.readerFor(Element.class)
                    .with(schema)
                    .readValues(reader);
            List<Element> elements = iterator.readAll();

            for (Element element : elements) {
                System.out.println(element.toString());
            }

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
