import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.event.*;

public class testFront implements ActionListener
{
    JFrame jfm;
    JLabel j1;
    JPanel p1;
    ImageIcon img,imgb;
    JButton b1;
    public int score;
    long StartTime,EndTime,NitTime,GotTime;

    testFront()
    {
        StartTime=System.currentTimeMillis();
        jfm = new JFrame("IQ_TEST");
        jfm.setSize(900,670);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setLayout(new BorderLayout());
        j1 = new JLabel();
        j1.setLayout(new FlowLayout());
        img = new ImageIcon("img/neub.gif");
        j1.setIcon(img);
        
        
        
        p1=new JPanel();
        p1.add(j1);
        
        
        img = new ImageIcon("img/fbutton.jpg");
        b1 = new JButton("START");
        b1.addActionListener(this);
        //b1.setIcon(img);
        j1.add(b1);
        jfm.add(p1);
        
        jfm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        try {
            selection ob = new selection();
            jfm.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(testFront.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[])
    {
        testFront ob= new testFront();
    }
    
}