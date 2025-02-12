import java.net.*;

public class CgeckDomainName {
    public static void main(String[] args) {
        String domain1 = "docs.google.com";
        String domain2 = "slides.google.com";
        
        try {
            InetAddress address1 = InetAddress.getByName(domain1);
            InetAddress address2 = InetAddress.getByName(domain2);
            
            System.out.println(domain1 + " IP: " + address1.getHostAddress());
            System.out.println(domain2 + " IP: " + address2.getHostAddress());
            
            if (address1.equals(address2)) {
                System.out.println("Both domains resolve to the same IP address.");
            } else {
                System.out.println("Domains resolve to different IP addresses.");
            }
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve one or both domain names.");
        }
    }
}
