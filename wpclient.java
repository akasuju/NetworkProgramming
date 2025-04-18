import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramSocketImplFactory;
import java.net.InetAddress;

import javax.xml.crypto.Data;

import java.DatagramPacket;

public static class wpclient {
    public static void main(String[] args) throws IOException{
        DatagramSocket client -new DatagramSocket();

        String content="Hello, Server";
        byte[] messageToServer =content.getBytes();

        InetAddress serverAddress = InetAddress.getByName("localhost");
        int serverPort = 5555;

        DatagramPacket sendPacket = new DatagramPacket(messageToServer, messageToServer.length, serverAddress, serverPort);
        client.send(sendPacket);
        client.close();
    
    }
}
