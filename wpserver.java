import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class wpserver {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(5555);
            System.out.println("Server is running and waiting for messages...");

            byte[] buffer = new byte[256];
            DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);

            while (true) {
                serverSocket.receive(receivePacket);
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received message: " + message);

                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting server...");
                    break;
                }
            }

            serverSocket.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
