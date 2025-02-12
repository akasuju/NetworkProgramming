
//no.5
import java.net.InetAddress;

public class IPAddresses {
    public static void main(String[] args) {
        try {
            InetAddress[] inetAddresses = InetAddress.getAllByName("www.google.com");
            for (InetAddress inetAddress : inetAddresses) {
                System.out.println("Address: " + inetAddress.getHostAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
