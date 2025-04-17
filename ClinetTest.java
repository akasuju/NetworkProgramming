import java.nio.channels.SocketChannel;
import java.util.Scanner;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ClinetTest {
    public static void main(String[] args) {
        try {
            SocketChannel clientChannel = SocketChannel.open(new InetSocketAddress("localhost", 5555));
            System.out.println("Client connected to server");
            Scanner sc = new Scanner(System.in);
            ByteBuffer b = ByteBuffer.allocate(256);
            while (true) {
                System.out.print("Enter message for server: ");
                String message = sc.nextLine();
                b.clear();
                b.put(message.getBytes());
                b.flip();
              String ServerMessage = new String(b.array()).trim();
                System.out.println("Server: " + ServerMessage);
                clientChannel.write(b);
                b.clear();
                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting...");
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
