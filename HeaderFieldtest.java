import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.io.IOException;

public class HeaderFieldtest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection conn = url.openConnection();
            System.out.println(conn.getHeaderField("Content-Type"));
            System.out.println(conn.getHeaderField("Content-Length"));
            System.out.println(conn.getHeaderField("Date"));
            System.out.println(conn.getHeaderField("Server"));
            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

