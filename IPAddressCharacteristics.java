//no.9
import java.net.InetAddress;

public class IPAddressCharacteristics {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            System.out.println("Is Loopback: " + inetAddress.isLoopbackAddress());
            System.out.println("Is Multicast: " + inetAddress.isMulticastAddress());
            System.out.println("Is Any Local: " + inetAddress.isAnyLocalAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
