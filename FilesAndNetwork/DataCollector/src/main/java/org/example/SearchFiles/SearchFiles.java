package org.example.SearchFiles;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.find;
import static java.nio.file.Files.isRegularFile;

public class SearchFiles extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (!String.valueOf(file.getFileName()).startsWith(".")) {
            System.out.println(file.getParent() + " " + file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
