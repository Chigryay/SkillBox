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
    public void printNamesLines() throws IOException {
        Map<String, String> linesMetro = new LinesMetro().linesMetro;
        for (Map.Entry<String, String> lineMetro : linesMetro.entrySet()) {
            System.out.println(lineMetro.getKey() + " - " + lineMetro.getValue());
        }
    }

}
