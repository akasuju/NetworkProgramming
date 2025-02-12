import java.net.*;

public class DetermineIP {
    public static void main(String[] args) {
        String ipAddress = "8.8.8.8"; // Example IP address
        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            if (inetAddress instanceof Inet4Address) {
                System.out.println(ipAddress + " is an IPv4 address.");
            } else if (inetAddress instanceof Inet6Address) {
                System.out.println(ipAddress + " is an IPv6 address.");
            } else {
                System.out.println("Unknown IP address type.");
            }
        } catch (UnknownHostException e) {
            System.out.println("Could not determine the IP address type for " + ipAddress);
        }
    }
}
//Lab4