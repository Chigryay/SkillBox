package org.example;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        try (Socket cleintSocket = new Socket("127.0.0.1", 8080)) {
            OutputStream out = cleintSocket.getOutputStream();
            PrintStream print = new PrintStream(out, true);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                String msg = scanner.nextLine();
                print.println(msg + "\n");
                print.flush();
                InputStream inputStream = cleintSocket.getInputStream(); // То что пришло от сервера, но не читаем еще
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); // Уже читаем то, что пришло

                String outMsg = reader.readLine();

                System.out.println(outMsg);
            }

        }

    }
}