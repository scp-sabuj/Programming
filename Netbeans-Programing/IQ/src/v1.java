import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import javax.swing.event.*;

public class v1 implements ActionListener
{
    JFrame jfm;
    JLabel j1;
    JPanel p1;
    ImageIcon img;
    JTextField t1;
    JButton b1;
    public int score;
    long StartTime,EndTime,NitTime,GotTime;

    v1()
    {
        StartTime=System.currentTimeMillis();
        jfm = new JFrame("IQ_TEST");
        jfm.setSize(901,676);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setLayout(new GridLayout(1,1));
          
            
        j1 = new JLabel();
        img = new ImageIcon("img/v1.jpg");
        
        
        
        b1 = new JButton("NEXT");
        b1.setIcon(img);
        b1.addActionListener(this);
        
        
        
        
        
       
        jfm.add(b1);
        jfm.setVisible(true);
        score =0;
    }
    public void actionPerformed(ActionEvent ae)
    {
       EndTime=System.currentTimeMillis();
        NitTime=EndTime-StartTime;
        NitTime=(int)NitTime/1000;
        v1a ob = new v1a(0,NitTime);
       jfm.setVisible(false);
    }
    
    
    
    public static void main(String args[])
    {
        v1 ob= new v1();
    }
 
}
