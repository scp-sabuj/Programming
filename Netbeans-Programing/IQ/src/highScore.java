import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.*;

class highScore implements ActionListener
{
    JFrame jfm;
    JPanel p1,p2,p2a,p2b,p2c,p2d,p2e,p2f;
    JLabel j1,j2,j1d;
    String st1,st2;
    JButton b1,b2;
    ImageIcon img;
    JMenuBar menuBar;
    JMenu m1;
    FileReader f1,f2;
    BufferedReader out1,out2;
    
    FileWriter fn1,fn2;
    BufferedWriter ou1,ou2;
    
    public highScore() throws Exception
    {
        jfm = new JFrame("High Score"); 
        jfm.setSize(300,500);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setLayout(new GridLayout(2,1));
        
        
        f1 = new FileReader("output1.txt");
        
        out1 = new BufferedReader(f1);
        String line1 = out1.readLine();
           
        st1 = line1;
        out1.close();
        
        f2 = new FileReader("output2.txt");
        
        out2 = new BufferedReader(f2);
        String line2 = out2.readLine();
           
        st2 = line2;
        out2.close();
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(2,2));
        j1 = new JLabel();
        j2= new JLabel();
        
        
        
        j1.setText("Visualization Test High Score:  "+st1);
        j2.setText("Math Test High Score:  "+st2);
        
        
        p1.add(j1);
        p1.add(j2);
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(2,3));
        p2a = new JPanel();
        p2b = new JPanel();
        p2c = new JPanel();
        p2d = new JPanel();
        p2e = new JPanel();
        p2f = new JPanel();
        
        b1 = new JButton();
        b1.setText("Go to HOME");
        //b1.setIcon(img);
        b1.addActionListener(this);
        b2 = new JButton();
        b2.setText("RESET");
        //b1.setIcon(img);
        b2.addActionListener(this);
        j1d= new JLabel();
        j1d.setText("");
        
        p2b.add(j1d);
        p2b.add(b1);
        p2b.add(b2);
        p2.add(p2a);
        p2.add(p2b);
        p2.add(p2c);
        p2.add(p2d);
        p2.add(p2e);
        p2.add(p2f);
        
        jfm.add(p1);
        jfm.add(p2);
        
        
        jfm.setVisible(true);
        
        
        
        
    }
    public void actionPerformed(ActionEvent e)
    { 
        if(e.getSource() == b1)
         {
            jfm.setVisible(false);
            try {
                selection ob= new selection();
            } catch (Exception ex) {
                Logger.getLogger(highScore.class.getName()).log(Level.SEVERE, null, ex);
            }
    
         }
        else if(e.getSource() == b2)
         {
            try {
            int scr=0,scr1=0;
            String s1 = String.valueOf(scr);
            String s2 = String.valueOf(scr1);
            fn1=null;
            fn1 = new FileWriter("output1.txt",false);
            ou1 = new BufferedWriter(fn1);
            ou1.write(s1);
            ou1.close();
            
            fn2=null;
            fn2 = new FileWriter("output2.txt",false);
            ou2 = new BufferedWriter(fn2);
            ou2.write(s2);
            ou2.close();
            jfm.setVisible(false);
            
             highScore ob = new highScore();
            } catch (Exception ex) {
                Logger.getLogger(highScore.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    
         }
    }
    
}