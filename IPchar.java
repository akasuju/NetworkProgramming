import java.net.*;
import java.util.*;

public class IPchar {
    public static void main(String[] args) {
        String ipAddress = "127.0.0.1"; // Example IP address
        
        try {
            InetAddress address = InetAddress.getByName(ipAddress);
            
            System.out.println("IP Address: " + address.getHostAddress());
            System.out.println("Is loopback address? " + address.isLoopbackAddress());
            System.out.println("Is multicast address? " + address.isMulticastAddress());
            System.out.println("Is wildcard address? " + address.isAnyLocalAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not retrieve details for the given IP address.");
        }
    }
}

//lab 9