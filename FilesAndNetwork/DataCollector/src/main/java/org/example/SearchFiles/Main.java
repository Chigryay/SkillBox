package org.example.SearchFiles;

import org.example.ParseFiles.ParseFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("data");
//        Files.walkFileTree(path, new SearchFiles());
        Files.walkFileTree(path, new ParseFile());
    }
}
