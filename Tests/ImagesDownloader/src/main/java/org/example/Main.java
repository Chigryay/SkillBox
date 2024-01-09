package org.example;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    private static final String URL = "https://volsch12.edusite.ru/DswMedia/kind.doc";
    private static final String PATH = "src/main/Images/";
    public static void main(String[] args) throws Exception {
        Document document = Jsoup.connect(URL).get();
        Elements images = document.select("a");
        List<String> linksList = images.stream()
                .map(element -> element.attributes().get("href"))
                .distinct()
                .toList();
        linksList.forEach(System.out::println);
        int i = 1;
        for (String link : linksList) {
            String extension = link
                    .replaceAll("^.+\\.", "")
                    .replaceAll("\\?[^png|jpg].[0-9]+$", "");
            download(PATH + i++ + "." + extension, link);
        }
    }


    public static void download(String path, String link) throws Exception {

        URL url = new URL(link);
        InputStream inputStream = url.openStream();
        System.out.println("Connect");
        Files.copy(inputStream, Path.of(PATH + "001.doc"));

        /*InputStream inputStream = new URL(link).openStream();
        System.out.println("Connected...");
        OutputStream outputStream = new FileOutputStream(path);
        int b;
        while ((b = inputStream.read()) != -1) {
            outputStream.write(b);
        }
        outputStream.flush();
        outputStream.close();
        inputStream.close();*/
    }

}