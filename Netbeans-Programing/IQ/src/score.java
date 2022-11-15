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

class score implements ActionListener
{
    JFrame jfm;
    JPanel p1,p2,p2a,p2b,p2c,p2d,p2e,p2f;
    JLabel j1,j2,j1a,j1b,j1c,j1d;
    String st1,st2;
    JButton b1;
    ImageIcon img;
    JMenuBar menuBar;
    JMenu m1;
    FileReader f1,f2;
    BufferedReader out1,out2;
    
    FileWriter fn1;
    BufferedWriter ou1;
    
    long hscr,scr;
    long time;
    
    public score(long x) throws Exception
    {
        jfm = new JFrame("Score"); 
        jfm.setSize(500,500);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setLayout(new GridLayout(2,1));
        
        
        f1 = new FileReader("output2.txt");
        
        out1 = new BufferedReader(f1);
        String line1 = out1.readLine();
           
        st1 = line1;
        out1.close();
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(2,2));
        j1 = new JLabel();
        j2= new JLabel();
        
        
        
        j1.setText("High Score:  "+st1);
        j2.setText("Your Score:  "+x);
        
        
        hscr=Integer.parseInt(st1);
        scr=x;
        
        j1a= new JLabel();
        j1a.setText("");
        
        j1b= new JLabel();
        j1b.setText("");
        
        j1c = new JLabel();
        j1c.setText("");
        
        
        
        p1.add(j1a);
        p1.add(j1);
        p1.add(j1c);
        p1.add(j1b);
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
        b1.addActionListener(this);
        j1d= new JLabel();
        j1d.setText("");
        
        p2b.add(j1d);
        p2b.add(b1);
        p2.add(p2a);
        p2.add(p2b);
        p2.add(p2c);
        p2.add(p2d);
        p2.add(p2e);
        p2.add(p2f);
        
        jfm.add(p1);
        jfm.add(p2);
        
        
        jfm.setVisible(true);
        
        if(hscr<scr)
        {
            //Object
            JOptionPane.showMessageDialog(jfm,"You Bet Previous Highscore!!!");
            String s1 = String.valueOf(scr);
            
            fn1=null;
            fn1 = new FileWriter("output2.txt",false);
            ou1 = new BufferedWriter(fn1);
            ou1.write(s1);
            ou1.close();
            jfm.setVisible(false);
            score ob = new score(x);
            
        }
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        jfm.setVisible(false);
        try {
            selection ob= new selection();
        } catch (Exception ex) {
            Logger.getLogger(score.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   // public static void main(String args[]) throws Exception
   // {
      //  score ob = new score(13);
   // }
    
}
