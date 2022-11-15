/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thread1;

import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author F.C
 */
class Runner extends Thread{
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                //Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
}

public class Thread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runner r1 = new Runner();
        r1.start();
        
        Runner r2 = new Runner();
        r2.start();
    }
    
}
