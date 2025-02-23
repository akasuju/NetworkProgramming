import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketImpl;
import java.util.Date;


public class serversocket {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(555);
          System.err.println("Waiting for a client");
          Socket socket = serverSocket.accept();
            System.err.println("Client connected"+socket.getInetAddress());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));  
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String clientMessage ;
            while((clientMessage = in.readLine())!=null){ 
                System.out.println("Client: "+clientMessage);
              System.out.print("Enter message for client: ");
              String serverMessage = console.readLine();
                out.println(serverMessage);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
