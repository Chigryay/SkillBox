package org.example.ParseFiles;

import javax.swing.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class ParseFile extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        try (BufferedInputStream inputStream = new BufferedInputStream(
                new FileInputStream(file.toFile()));
             BufferedOutputStream outputStream = new BufferedOutputStream(
                     new FileOutputStream(file.toFile()))){
            String className = file.toFile().getName().replaceAll("\\..+", ".java");
            Path pathToClassName = Paths.get("src/main/java/org/example/ParseFiles/" + className);
            Files.createFile(pathToClassName);

            return FileVisitResult.CONTINUE;
        }
    }
}
