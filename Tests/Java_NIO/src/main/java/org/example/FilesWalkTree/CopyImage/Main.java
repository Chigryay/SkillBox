package org.example.FilesWalkTree.CopyImage;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\fadem\\OneDrive\\Desktop\\roadmap.jpg");
        Path destination  = Paths.get("src/main/resources/data/roadmap.jpg");

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(source.toString()));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destination.toString()))) {
            ByteBuffer buffer = ByteBuffer.wrap(inputStream.readAllBytes());
            while (buffer.hasRemaining()) {
                outputStream.write(buffer.get());
            }
        }
    }
}
