package Test_2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ClientSocketChannel {
    private static final String HOSTNAME = "127.0.0.1";
    private static final int PORT = 8080;
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress(HOSTNAME, PORT));
        System.out.println("Connected...");

        String msg = "Hello Server";

        ByteBuffer buffer = ByteBuffer.wrap(msg.getBytes());
        socketChannel.write(buffer);
        System.out.println("Sent message to server: " + msg);
        socketChannel.close();
    }

}
