package org.example;

import org.example.HTML.ParseHTML;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ParseHTML parseHTML = new ParseHTML();
//        parseHTML.printNamesLinesMetro();
        parseHTML.printStationMetro();
    }
}