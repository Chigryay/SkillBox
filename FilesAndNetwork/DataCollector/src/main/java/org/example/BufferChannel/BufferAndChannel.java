package org.example.BufferChannel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferAndChannel {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file =
                     new RandomAccessFile("src/main/java/org/example/resources/text.txt", "rw");
        FileChannel channel = file.getChannel()){

            ByteBuffer byteBuffer = ByteBuffer.allocate(3);
            StringBuilder stringBuilder = new StringBuilder();

            int byteReader = channel.read(byteBuffer);
            while (byteReader > 0) {
                System.out.println("Read " + byteReader);
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()) {
                    stringBuilder.append((char)byteBuffer.get());
                }
                byteBuffer.clear();
                byteReader = channel.read(byteBuffer);
            }
            System.out.println(stringBuilder);
            ByteBuffer buffer = ByteBuffer.wrap(stringBuilder.toString().getBytes());
            channel.write(buffer);
        }
    }
}
