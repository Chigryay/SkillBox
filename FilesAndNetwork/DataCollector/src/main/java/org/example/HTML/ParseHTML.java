package org.example.HTML;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ParseHTML {
    private String URL = "https://skillbox-java.github.io/";
    private final Connection connection = Jsoup.connect(URL);

    public Document getDocument() {
        return document;
    }

    private final Document document = getHTML();

    public ParseHTML() throws IOException {
    }

    protected Document getHTML() throws IOException {
        return connection.get();
    }

    public void printNamesLinesMetro() throws IOException {
        Map<String, String> linesMetro = new LinesMetro().linesMetro;
        System.out.println("Номер линии   Наименование линии");
        for (Map.Entry<String, String> lineMetro : linesMetro.entrySet()) {
            System.out.println(lineMetro.getKey() + "\t\t\t-\t" + lineMetro.getValue());
        }
    }
    public void printStationMetro() throws IOException {
        Map<String, Integer> stationsMetro = new StationsMetro().stationsMap;
        System.out.println("Номер станции   Наименование линии");
        for (Map.Entry<String, Integer> stationMetro : stationsMetro.entrySet()) {
            System.out.println(stationMetro.getValue() + "\t\t\t  -\t\t" + stationMetro.getKey());
        }
        System.out.println(stationsMetro.size());
    }

}
