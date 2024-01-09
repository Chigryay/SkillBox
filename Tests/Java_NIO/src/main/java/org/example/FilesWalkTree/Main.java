package org.example.FilesWalkTree;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("src/main/resources");
        Path destination = Paths.get("src/Data");

        Files.walkFileTree(source, new TestFileVisitor());
    }
}
