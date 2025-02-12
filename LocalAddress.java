import java.net.*;

public class LocalAddress {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("IP Address of local machine: " + localHost.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not retrieve local IP address");
        }
    }
}
//Lab2