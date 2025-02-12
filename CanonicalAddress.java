import java.net.*;

public class CanonicalAddress {
    public static void main(String[] args) {
        String ipAddress = "8.8.8.8"; // Example IP address
        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            System.out.println("Canonical Hostname for " + ipAddress + " is: " + inetAddress.getCanonicalHostName());
        } catch (UnknownHostException e) {
            System.out.println("Could not retrieve canonical hostname for " + ipAddress);
        }
    }
}
//Lab3