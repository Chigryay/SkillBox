package org.example.HTML;

import org.example.HTML.ParseHTML;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ParseHTML parseHTML = new ParseHTML();
        parseHTML.printNamesLinesMetro();
        System.out.println("/--------------------------------------/");
        parseHTML.printStationMetro();
    }
}