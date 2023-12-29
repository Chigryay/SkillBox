package org.example.HTML;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StationsMetro {
    private final Document document = new ParseHTML().getDocument();
    /*Elements elementsNumberLines =  document.select(".single-station>.num");
    Elements elementsNamesStations =  document.select(".single-station>.name");*/
    private final Elements elements = document.select(".single-station");

    public StationsMetro() throws IOException {
    }
    protected Map<String, Integer> stationsMap = getStations();
    private Map<String, Integer> getStations() {
        Map<String, Integer> stationsMap = new TreeMap<>();

        for (Element element : elements) {
            String[] splitLine = element.text().split("\\.\\s");
            int numberStation = Integer.parseInt(splitLine[0]);
            String nameStation = splitLine[1];
            stationsMap.put(nameStation, numberStation);
        }
        return stationsMap;
    }
}
