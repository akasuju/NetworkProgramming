//no.3
import java.net.InetAddress;

public class CanonicalHostName {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("8.8.8.8");
            System.out.println("Canonical Host Name: " + inetAddress.getCanonicalHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
