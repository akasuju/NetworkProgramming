// // no.11

// import java.net.InetAddress;
// import java.util.Arrays;
// import java.util.List;

// public class SpamCheck {
//     private static final List<String> spamIPAddresses = Arrays.asList("192.168.1.1", "203.0.113.1");

//     public static void main(String[] args) {
//         try {
//             InetAddress senderAddress = InetAddress.getByName("203.0.113.1");
//             if (spamIPAddresses.contains(senderAddress.getHostAddress())) {
//                 System.out.println("Sender's IP address is marked as spam.");
//             } else {
//                 System.out.println("Sender's IP address is not marked as spam.");
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamCheck {
    private static String reverseIP(String IP) {
        String[] octets = IP.split("\\.");
        String reversed = "";
        for (int i = octets.length - 1; i >= 0; i--) {
            reversed += octets[i];
            if (i > 0) {
                reversed += ".";
            }
        }
        return reversed;
    }

    public static void main(String[] args) throws UnknownHostException {
        String IP = "207.87.34.17";
        String blackHoleDomain = "sbl.spamhous.org";

        String reverseIP = reverseIP(IP);
        String finalDomain = reverseIP + "." + blackHoleDomain;

        try {
            // System.out.println(finalDomain);
            InetAddress address = InetAddress.getByName(finalDomain);
            System.out.println(IP + " is a spam");
        } catch (UnknownHostException e) {
            System.out.println(IP + " is not a spam.");
        }

    }
}