package org.example.HTML;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class StationsMetro {
    private static final Document document;

    static {
        try {
            document = new ParseHTML().getDocument();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final Elements elements = document.select(".single-station");

    public StationsMetro() throws IOException {
    }

    protected static List<String> stationsName = getStationsName();
    protected static List<Integer> stationsNumber = getStationsNumber();

    private static List<String> getStationsName() {
        List<String> stationsName = new ArrayList<>();
        for (Element element : elements) {
            String[] splitLine = element.text().split("\\.\\s");
            stationsName.add(splitLine[1]);
        }
        return stationsName;
    }

    private static List<Integer> getStationsNumber() {
        List<Integer> stationsNumber = new ArrayList<>();
        for (Element element : elements) {
            String[] splitLine = element.text().split("\\.\\s");
            stationsNumber.add(Integer.valueOf(splitLine[0]));
        }
        return stationsNumber;
    }

}
