package socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server implements Runnable{

    Socket sock;
    PrintStream prStream;
    InputStreamReader inStream;
    
    public Server(Socket sock) {
        this.sock = sock;
        try {
            prStream = new PrintStream(sock.getOutputStream());
            inStream = new InputStreamReader(sock.getInputStream());
        } catch (IOException ex) {
            
        }
    }
    
    public static void main(String[] args) throws IOException {
        ServerSocket srvSocket = new ServerSocket(237);
        System.out.println("Waiting for Client...");
        Socket sock = srvSocket.accept();
        System.out.println("Accepted");
        Server myServer = new Server(sock);
        Thread th1 = new Thread(myServer);
        th1.start();
    }

    @Override
    public void run()
    {
        BufferedReader bReader = new BufferedReader(inStream);
        String msg;
        try{
            while(true)
            {
                msg = bReader.readLine();
                if(msg != null)
                {
                    System.out.println("Client: "+msg);
                    System.out.print("Server: ");
                    Scanner scan = new Scanner(System.in);
                    prStream.println(scan.nextLine());
                }

            }
        }catch(Exception ex){
            
        }
    }
    
}
