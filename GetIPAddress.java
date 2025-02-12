import java.net.*;

public class GetIPAddress {
    public static void main(String[] args) {
        String domain = "newsummit.edu.np";
        try {
            InetAddress address = InetAddress.getByName(domain);
            System.out.println("IP Address of " + domain + " is: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve the IP address of " + domain);
        }
    }
}
//Lab1
