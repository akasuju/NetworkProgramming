//no.8(b)
import java.net.InetAddress;
import java.net.NetworkInterface;

public class ReachabilityCheckWithInterface {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.google.com");
            NetworkInterface networkInterface = NetworkInterface.getByName("eth0");
            if (inetAddress.isReachable(networkInterface, 5, 5000)) {
                System.out.println("Host is reachable via eth0.");
            } else {
                System.out.println("Host is not reachable via eth0.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
