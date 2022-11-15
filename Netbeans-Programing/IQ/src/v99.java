import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.*;

public class v99 implements ActionListener
{
    JFrame jfm;
    JLabel j1;
    JPanel p1;
    ImageIcon img;
    JTextField t1;
    JButton b1;
    public int score;

    long StartTime,EndTime,NitTime,GotTime;
    v99(int s,long t)
    {
        GotTime = t;
        StartTime=System.currentTimeMillis();
        
        
        jfm = new JFrame("IQ_TEST");
        jfm.setSize(899,674);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setLayout(new GridLayout(1,1));
          
            
        j1 = new JLabel();
        img = new ImageIcon("img/v99.jpg");
        
        
        
        b1 = new JButton("NEXT");
        b1.setIcon(img);
        b1.addActionListener(this);
        
        
        
        
        
       
        jfm.add(b1);
        jfm.setVisible(true);
        score =s;
    }
     public void actionPerformed(ActionEvent ae)
    {
        try {
            EndTime=System.currentTimeMillis();
            NitTime=EndTime-StartTime;
            NitTime=(int)NitTime/1000;
            NitTime=NitTime+GotTime;
            v99a ob = new v99a(score,NitTime);
            jfm.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(v99.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 
}
