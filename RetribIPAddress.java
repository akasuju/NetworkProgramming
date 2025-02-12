import java.net.*;

public class RetribIPAddress {
    public static void main(String[] args) {
        String host = "www.google.com"; // Example web address
        try {
            InetAddress[] addresses = InetAddress.getAllByName(host);
            System.out.println("IP addresses for " + host + ":");
            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress() + (address instanceof Inet4Address ? " (IPv4)" : " (IPv6)"));
            }
        } catch (UnknownHostException e) {
            System.out.println("Could not retrieve IP addresses for " + host);
        }
    }
}
//Lab5
