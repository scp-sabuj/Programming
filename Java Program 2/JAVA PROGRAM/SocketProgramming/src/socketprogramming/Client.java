
package socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable{

    Socket sock;
    PrintStream prStream;
    InputStreamReader inStream;
    
    public Client(Socket sock) throws IOException {
        this.sock = sock;
        prStream = new PrintStream(sock.getOutputStream());
        inStream = new InputStreamReader(sock.getInputStream());
    }
    
    public static void main(String args[]) throws IOException
    {
        Socket sock = new Socket("127.0.0.1", 237);
        Client myClient = new Client(sock);
        Thread th1 = new Thread(myClient);
        th1.start();
    }

    @Override
    public void run() {
        BufferedReader bReader = new BufferedReader(inStream);
        String msg;
        while(true)
        {
            try {
                System.out.print("Client: ");
                Scanner scan = new Scanner(System.in);
                prStream.println(scan.nextLine());
                msg = bReader.readLine();
                if(msg != null){
                    System.out.println("Server: "+msg);
                }
                
                
            } catch (IOException ex) {
            }
        }
    }
    
}
