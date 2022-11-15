/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationusingthread;

/**
 *
 * @author F.C
 */
class Runner extends Thread {

    @Override
    public void run() {

        try {
            NewJFrame1 obj = new NewJFrame1();
            NewJFrame2 obj1 = new NewJFrame2();
            
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            //Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

public class ApplicationUsingThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Runner r1 = new Runner();
        r1.start();
        
    }

}
