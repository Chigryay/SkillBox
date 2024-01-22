package org.example;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/dates-1.csv"))){

            CsvMapper mapper = new CsvMapper();
            CsvSchema schema = mapper.schemaFor(Files.class)
                    .withColumnSeparator(',').withSkipFirstDataRow(true);
            MappingIterator<Files> iterator = mapper
                    .readerFor(Files.class)
                    .with(schema)
                    .readValues(reader);
            List<Files> files = iterator.readAll();
            for (Files file : files) {
                System.out.println(file.toString());
            }

        }
    }
}
