
//no.4
// import java.net.InetAddress;

// public class IPVersionCheck {
//     public static void main(String[] args) {
//         try {
//             String customAddress = "2001:4860:4860::8888";
//             InetAddress inetAddress = InetAddress.getByName(customAddress);
//             String address = inetAddress.getHostAddress();
//             if (address.contains(":")) {
//                 System.out.println(customAddress + " is IPv6 Address");
//             } else {
//                 System.out.println(customAddress + " is IPv4 Address");
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }


import java.net.InetAddress;
import java.net.UnknownHostException;

public class SimpleIPAddressChecker {

    public static void main(String[] args) {
        String ipAddress1 = "192.168.1.1";
        String ipAddress2 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        String ipAddress3 = "invalid-ip";

        System.out.println(ipAddress1 + " is " + checkIPAddress(ipAddress1));
        System.out.println(ipAddress2 + " is " + checkIPAddress(ipAddress2));
        System.out.println(ipAddress3 + " is " + checkIPAddress(ipAddress3));
    }

    public static String checkIPAddress(String ipAddress) {
        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            if (inetAddress.getHostAddress().contains(":")) {
                return "IPv6";
            } else {
                return "IPv4";
            }
        } catch (UnknownHostException e) {
            return "Invalid IP Address";
        }
    }
}