import java.io.BufferedReader;
import java.net.Socket;
import java.nio.Buffer;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 555);
            System.out.println("Connected to server");
           BufferedReader input= new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        while (true) {
            System.out.print("Enter message for server: ");
            String clientMessage = console.readLine();
            out.println(clientMessage);
            String serverMessage = input.readLine();
            System.out.println("Server: " + serverMessage);
            
        }
        }
        catch (Exception e){
            
    }
}
}
