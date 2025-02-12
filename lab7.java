import java.net.*;
import java.util.*;

public class lab7 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();
                System.out.println("Interface: " + networkInterface.getName());
                
                Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress address = addresses.nextElement();
                    System.out.println("  Address: " + address.getHostAddress());
                }
            }
        } catch (SocketException e) {
            System.out.println("Could not retrieve network interfaces.");
        }
    }
}
