package org.example;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connect " + clientSocket.getInetAddress());
            if (clientSocket.isConnected()) {
                InputStream inputStream = clientSocket.getInputStream();

                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String inMsg = reader.readLine();
                System.out.println(inMsg);


                OutputStream outputStream = clientSocket.getOutputStream();
                PrintWriter print = new PrintWriter(outputStream, true);
                String msg = reader.readLine();
                print.println("Hello");
                print.flush();
            }



        }

    }
}
