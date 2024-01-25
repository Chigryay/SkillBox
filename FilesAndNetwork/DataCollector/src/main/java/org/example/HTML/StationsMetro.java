package org.example.HTML;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class StationsMetro {
    private final Document document = new ParseHTML().getDocument();

    private final Elements elements = document.select(".single-station");

    public StationsMetro() throws IOException {
    }

    protected List<String> stationsName = getStationsName();
    protected List<Integer> stationsNumber = getStationsNumber();

    private List<String> getStationsName() {
        List<String> stationsName = new ArrayList<>();
        for (Element element : elements) {
            String[] splitLine = element.text().split("\\.\\s");
            stationsName.add(splitLine[1]);
        }
        return stationsName;
    }

    private List<Integer> getStationsNumber() {
        List<Integer> stationsNumber = new ArrayList<>();
        for (Element element : elements) {
            String[] splitLine = element.text().split("\\.\\s");
            stationsNumber.add(Integer.valueOf(splitLine[0]));
        }
        return stationsNumber;
    }

}
