package org.example.HTML;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class LinesMetro {


    private static final Document document;

    static {
        try {
            document = new ParseHTML().getDocument();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public LinesMetro() throws IOException {
    }

    static Elements elements = getElements();

    private static Elements getElements() {
        return elements = document.select("span.t-metrostation-list-header");
    }

    protected static List<String> nameLines = getNameLines();
    protected static List<String> numberLines = getNumberLines();

    private static List<String> getNameLines() {
        List<String> nameLines = new ArrayList<>();
        for (Element element : elements) {
            nameLines.add(element.text());
        }
        return nameLines;
    }

    private static List<String> getNumberLines() {
        List<String> numberLines = new ArrayList<>();
        for (Element element : elements) {
            numberLines.add(element.attr("data-line"));
        }
        return numberLines;
    }

}
