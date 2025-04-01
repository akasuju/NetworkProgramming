import java.io.IOException;
import java.nio.channels.ServerSocketChannel;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

public class Servertest {
    public static void main (String[] args) {
        try {
            // Create Server Socket Channel in non blocking code
            ServerSocketChannel server = ServerSocketChannel.open();
            server.configureBlocking(false);
            server.bind(new InetSocketAddress(5555));

            //Creaate a selector
            Selector selector = Selector.open();
            server.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("Server started on port 5555");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
