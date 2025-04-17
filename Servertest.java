import java.io.IOException;
import java.nio.channels.ServerSocketChannel;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.nio.channels.SelectableChannel;


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

            while(true){
                //wait for client
                selector.select();

                // Retreive ready keys
                Iterator <SelectionKey> keys = selector.selectedKeys().iterator();
                while(keys.hasNext()){
                    SelectionKey key = keys.next();
                    keys.remove();

                    if(key.isAcceptable()){
                        // Accept the connection
                        ServerSocketChannel client = (ServerSocketChannel) key.channel();
                        client.accept();
                        System.out.println("Client connected: " + client.getLocalAddress());
                    }
                    else if(key.isReadable()){
                        // Read from the client
                        System.out.println("Client is readable");
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
