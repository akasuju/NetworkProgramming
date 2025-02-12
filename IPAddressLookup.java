//no.1
import java.net.InetAddress;

public class IPAddressLookup {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("newsummit.edu.np");
            System.out.println("IP Address: " + inetAddress.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
