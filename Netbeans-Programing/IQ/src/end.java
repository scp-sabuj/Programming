import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class end implements ActionListener
{
    JFrame jfm;
    JPanel p1,p2,p3;
    JLabel lab1,lab2,lab3;
    String st1,st2;
    JButton b1;
    
    FileReader f1,f2;
    BufferedReader out1,out2;
    
    int hscr,scr;
    
    FileWriter fw;
    BufferedWriter outw;
            
     end(int s)
    {
        scr=s;
        
        try {
            jfm = new JFrame("Daily Routine");
            jfm.setSize(500,305);
            jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jfm.setResizable(false);
            jfm.setLocationRelativeTo(null);
            jfm.setLayout(new GridLayout(3,1));
            
            lab1=new JLabel();
            lab2=new JLabel();
            
            p1= new JPanel();
            p1.add(lab1);
            
            p2= new JPanel();
            lab2.setText("Your Score is "+scr);
            p2.add(lab2);
            
            
            lab1= new JLabel();
            p3= new JPanel();
            p3.add(lab1);
            
            
            
            
            
            f1 = new FileReader("output1.txt");
            
            out1 = new BufferedReader(f1);
            String line1 = null;
            try {
                line1 = out1.readLine();
            } catch (IOException ex) {
                Logger.getLogger(end.class.getName()).log(Level.SEVERE, null, ex);
            }
            String st1 = line1;
            try {
                out1.close();
            } catch (IOException ex) {
                Logger.getLogger(end.class.getName()).log(Level.SEVERE, null, ex);
            }
            hscr=Integer.parseInt(st1);
            //System.out.println(st1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(end.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
            //St1 is previous High Score;
          
        
         lab3= new JLabel();
        lab3.setText("\nHHH "+hscr);//"High Score is "+
        p3.add(lab3);
        
        
        
        
        
        
        
        jfm.add(p1);
        jfm.add(p2);
        jfm.add(p3);
        
        
        
        st2= ""+scr;
        
        /*  if(scr>hscr)
            {
            try {
                fw=null;
                fw = new FileWriter("output1.txt",false);
                outw = new BufferedWriter(fw);
                outw.write(""+scr);
                outw.close();
            } catch (IOException ex) {
                Logger.getLogger(end.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
            }*/
        
        
        
        jfm.setVisible(true);
        
        
    }
     public void actionPerformed(ActionEvent e)
    {
        
    }
     
     public static void main(String args[])
    {
        end ob = new end(50);
    }
     
     
     
     
     
     
    
}
