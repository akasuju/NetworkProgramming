//no.2
import java.net.InetAddress;

public class LocalIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println("Local IP Address: " + inetAddress.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
