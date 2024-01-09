package org.example;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = "Alex \n Chiga";
        ByteBuffer buffer = ByteBuffer.allocate(str.length());

        Path path1 = Path.of("src\\main\\resources\\inputFile.txt");
        Files.deleteIfExists(path1);
        Path path2 = Path.of("src\\main\\resources\\outputFile.txt");
        Files.deleteIfExists(path2);

        Files.createFile(path1);
        Files.createFile(path2);

        FileWriter writer = new FileWriter("src\\main\\resources\\inputFile.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path1)))) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(writer);
                 BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(String.valueOf(path2)))) {

                Charset charset = StandardCharsets.UTF_8;
                buffer.put(charset.encode(str));
                System.out.println(Stream.of(Arrays.toString(buffer.array())).toList());
                ;
                buffer.flip();

                CharBuffer charBuffer = charset.decode(buffer);
                Stream.of(charBuffer).forEach(System.out::println);

                bufferedWriter.write(str);
                bufferedWriter.close();
                List<String> list = new ArrayList<>();
                String line;
                while ((line = reader.readLine()) != null) {
                    list.add(line);
                }
                list.forEach(System.out::println);

                bufferedWriter2.write(Arrays.toString(list.toArray()));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}