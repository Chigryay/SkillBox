package Test_2;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProtocolFamily;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelExample {
    public static int PORT = 8080;
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(PORT));
        System.out.println("Server started on port " + PORT);

        SocketChannel socketChannel = serverSocketChannel.accept();
        System.out.println("Client connected: " + socketChannel.getRemoteAddress());

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int bytesRead = socketChannel.read(buffer);
        String msg = new String(buffer.array(), 0, bytesRead);
        System.out.println(msg);
        socketChannel.close();
        serverSocketChannel.close();
    }
}
