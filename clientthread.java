import java.io.BufferedReader;
import java.net.Socket;
import java.nio.Buffer;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class clientthread {
    public static void main(String[] args) {
        try {
            // Ensure the server is running and listening on port 5555
            Socket socket = new Socket("localhost", 555);
            System.out.println("Connected to server");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
           
//send to server
                Thread t1= new Thread(()->{
                    try{
                    System.out.print("Enter message for server: ");
                    String clientMessage = console.readLine();
                    out.println(clientMessage);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            });
           
Thread t2= new Thread(()->{
    try{
        String serverMessage;
        while((serverMessage = input.readLine())!=null){
            System.out.println("Server: "+serverMessage);
            System.out.print("Enter message for server: ");
           
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
});
t1.start();
t2.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
