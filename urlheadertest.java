import java.net.*;
import java.io.IOException;

public class urlheadertest{
    public static void main (String[] args){
        try {
            URL u = new URL("http://www.google.com");
            URLConnection conn = u.openConnection();
            for (int i = 0; i <= 8; i++) {
                System.out.println(conn.getHeaderFieldKey(i) + " = " + conn.getHeaderField(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}