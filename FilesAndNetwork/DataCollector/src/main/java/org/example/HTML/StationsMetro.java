package org.example.HTML;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StationsMetro {
    private final Document document = new ParseHTML().getDocument();
    /*Elements elementsNumberLines =  document.select(".single-station>.num");
    Elements elementsNamesStations =  document.select(".single-station>.name");*/
    private Elements elements = document.select(".single-station");

    public StationsMetro() throws IOException {
    }
    protected Map<Integer, String> stationsMap = getStations();
    private Map<Integer, String> getStations() {
        Map<Integer, String> stationsMap = new TreeMap<>();
        int numberStation;
        String nameStation;
        for (Element element : elements) {
            String[] splitLine = element.text().split("\\.\\s");
            numberStation = Integer.parseInt(splitLine[0]);
            nameStation = splitLine[1];
            stationsMap.put(numberStation, nameStation);
        }
        return stationsMap;
    }
}
