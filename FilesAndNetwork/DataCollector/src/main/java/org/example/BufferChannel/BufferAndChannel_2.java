package org.example.BufferChannel;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferAndChannel_2 {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                     new RandomAccessFile("src/main/java/org/example/resources/text.txt", "rw");
             FileChannel channel = file.getChannel();
        ){
            BufferedInputStream inputStream = new BufferedInputStream(
                    new FileInputStream("src/main/java/org/example/resources/text.txt"));
            ByteBuffer buffer = ByteBuffer.wrap(inputStream.readAllBytes());
            channel.read(buffer);
            StringBuilder stringBuilder =new StringBuilder();
            buffer.flip();
            while (buffer.hasRemaining()) {
                stringBuilder.append((char)buffer.get());
            }
            System.out.println(stringBuilder);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
