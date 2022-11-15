import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.event.*;

public class selection implements ActionListener
{
    JFrame jfm;
    JLabel j1,j2;
    JPanel p1;
    ImageIcon img,bimg1,bimg2,bimg3,bimg4;
    JTextField t1;
    JButton b1,b2,b3,b4;
    private long x;
    

    selection() throws Exception
    {
        jfm = new JFrame("IQ_TEST");
        jfm.setSize(400,600);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setLayout(new GridLayout(5,1));
          
            
        j1 = new JLabel();
        
        img = new ImageIcon("img/s.png");
        j2 = new JLabel();
        j2.setIcon(img);
        
        
        bimg1 = new ImageIcon("img/pulse1.gif");
        b1=new JButton();
        b1 = new JButton("Instructin");
        b1.setIcon(bimg1);
        b1.addActionListener(this);
        
        bimg2 = new ImageIcon("img/pulse2.gif");
        b2=new JButton();
        b2 = new JButton("Visualization");
        b2.addActionListener(this);
        b2.setIcon(bimg2);
        
        bimg3 = new ImageIcon("img/pulse3.gif");
        b3=new JButton();
        b3 = new JButton("Math Test");
        b3.addActionListener(this);
        b3.setIcon(bimg3);
        
        bimg4 = new ImageIcon("img/pulse4.gif");
        b4=new JButton();
        b4 = new JButton("High Score");
        b4.setIcon(bimg4);
        b4.addActionListener(this);
        
        jfm.add(j2);
        jfm.add(b1);
        jfm.add(b2);
        jfm.add(b3);
        jfm.add(b4);
        jfm.setVisible(true);
        
    }
    
    
   public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b2)
        {
        
            v1 ob= new v1();
            jfm.setVisible(false);
        }
        else if(ae.getSource() == b3)
        {
       
            m1 ob = new m1();
            jfm.setVisible(false);
        }
        else if(ae.getSource() == b4)
        {
            try {
                highScore ob = new highScore();
                jfm.setVisible(false);
            } catch (Exception ex) {
                Logger.getLogger(selection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
