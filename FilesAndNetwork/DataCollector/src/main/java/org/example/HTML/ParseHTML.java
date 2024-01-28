package org.example.HTML;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ParseHTML {

    private final String URL = "https://skillbox-java.github.io/";
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

    public List<Integer> numberStationsMetro = getStationsNumberMetro();

    private List<Integer> getStationsNumberMetro() throws IOException {
        return StationsMetro.stationsNumber;
    }

    public List<String> nameStationsMetro = getStationsNameMetro();

    private List<String> getStationsNameMetro() throws IOException {
        return StationsMetro.stationsName;
    }

    public List<String> nameLinesMetro = getNameLinesMetro();

    private List<String> getNameLinesMetro() throws IOException {
        return LinesMetro.nameLines;
    }

    public List<String> numberLinesMetro = getNumberLinesMetro();

    private List<String> getNumberLinesMetro() throws IOException {
        return LinesMetro.numberLines;
    }
}
