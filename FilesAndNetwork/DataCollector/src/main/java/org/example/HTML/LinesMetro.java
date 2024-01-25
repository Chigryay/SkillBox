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

    private Elements getElements() {
        return elements = document.select("span.t-metrostation-list-header");
    }

    protected List<String> nameLines = getNameLines();
    protected List<String> numberLines = getNumberLines();

    private List<String> getNameLines() {
        List<String> nameLines = new ArrayList<>();
        for (Element element : elements) {
            nameLines.add(element.text());
        }
        return nameLines;
    }

    private List<String> getNumberLines() {
        List<String> numberLines = new ArrayList<>();
        for (Element element : elements) {
            numberLines.add(element.attr("data-line"));
        }
        return numberLines;
    }

}
