package org.example.HTML;

import org.example.HTML.ParseHTML;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ParseHTML parseHTML = new ParseHTML();

        List<String> nameLines = parseHTML.nameLinesMetro();
        List<String> numberLines = parseHTML.numberLinesMetro();

        nameLines.forEach(System.out::println);
        numberLines.forEach(System.out::println);

        System.out.println("/--------------------------------------/");

        List<String> stationsName = parseHTML.getStationsNameMetro();
        List<Integer> stationsNumber = parseHTML.getStationsNumberMetro();

        stationsName.forEach(System.out::println);
        stationsNumber.forEach(System.out::println);
    }
}