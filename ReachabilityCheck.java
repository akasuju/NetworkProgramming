//no.8(a)
import java.net.InetAddress;

public class ReachabilityCheck {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.google.com");
            if (inetAddress.isReachable(5000)) {
                System.out.println("Host is reachable.");
            } else {
                System.out.println("Host is not reachable.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

