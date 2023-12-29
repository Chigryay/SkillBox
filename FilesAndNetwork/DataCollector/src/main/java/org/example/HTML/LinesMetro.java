package org.example.HTML;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class LinesMetro {


    private final Document document = new ParseHTML().getDocument();

    public LinesMetro() throws IOException {
    }

    Elements elements = getElements();
    protected Map<String, String> linesMetro = getLines();

    private Elements getElements() {
        return elements = document.select("span.t-metrostation-list-header");

    }


    private Map<String, String> getLines() {
        Map<String, String> linesMetro = new TreeMap<>();
        String numberLine;
        String nameLine;
        for (Element element : elements) {
            nameLine = element.text();
            numberLine = element.attr("data-line");
            linesMetro.put(numberLine, nameLine);
        }
        return linesMetro;
    }
}
