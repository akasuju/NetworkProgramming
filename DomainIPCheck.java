//no.6
import java.net.InetAddress;

public class DomainIPCheck {
    public static void main(String[] args) {
        try {
            InetAddress addr1 = InetAddress.getByName("docs.google.com");
            InetAddress addr2 = InetAddress.getByName("slides.google.com");
            if (addr1.equals(addr2)) {
                System.out.println("Both domains refer to the same IP address.");
            } else {
                System.out.println("Domains refer to different IP addresses.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
