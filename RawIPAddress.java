//no.10
import java.net.InetAddress;

public class RawIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.google.com");
            byte[] address = inetAddress.getAddress();
            for (byte b : address) {
                System.out.print((b & 0xFF) + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
