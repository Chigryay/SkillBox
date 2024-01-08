package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String jSonFile = Files.readString(Path.of("src/main/resources/map.json"));
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper.readTree(jSonFile);

        JsonNode stations = jsonNode.get("stations");
        JsonNode connections = jsonNode.get("connections");
        JsonNode lines = jsonNode.get("lines");

        for (JsonNode line : lines) {
            ObjectNode lineNode = (ObjectNode) line;
            lineNode.remove("color");
            String lineNumber = line.get("number").asText();
            JsonNode stationList = stations.get(lineNumber);
            int count = stationList.size();
            lineNode.put("StationsCount", count);

            System.out.println(lineNode);
        }
        for (JsonNode station : stations) {
            ArrayNode stationNode = (ArrayNode) station;
//            System.out.println(stationNode);
        }
        for (JsonNode connection : connections) {
            ArrayNode connectionNode = (ArrayNode) connection;
//            System.out.println(connectionNode);
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File("src/main/resources/outputMapper.json"), lines);
    }
}