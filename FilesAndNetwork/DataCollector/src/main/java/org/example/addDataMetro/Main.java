package org.example.addDataMetro;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ParseFiles.Depths_1;
import org.example.ParseFiles.ParseFiles;

import java.io.*;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        AddDataMetro str = mapper.readValue(ParseFiles.parseCsvToPojo(Paths.get("src/main/java/org/example/data/2/4/depths-1.json")), AddDataMetro.class);
        System.out.println(str);
    }
}
