package Test_2;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class CopyInfoToFile {
    public static void main(String[] args) throws IOException {
        Path inputPath = Path.of("src/main/resources/input.txt");
        Path outputPath = Path.of("src/main/resources/output.txt");

        try (FileChannel input = FileChannel.open(inputPath ,StandardOpenOption.READ);
        FileChannel out = FileChannel.open(outputPath ,StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while (input.read(buffer) > -1) {
                buffer.flip();
                out.write(buffer);
                buffer.clear();
            }
        }
    }
}

