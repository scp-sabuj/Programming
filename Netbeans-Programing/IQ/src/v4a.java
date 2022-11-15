import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class v4a implements ActionListener
{
    JFrame jfm;
    JLabel j1;
    ImageIcon img1,img2,img3,img4;
    JButton b1,b2,b3,b4;
    JPanel p1,p2,p3,pa,pb,pc,pd;
    int score;
    long StartTime,EndTime,NitTime,GotTime;
    v4a(int s,long t)
    {
        GotTime = t;
        StartTime=System.currentTimeMillis();
        
        
        jfm = new JFrame("IQ_TEST");
        jfm.setSize(745,625);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setLayout(new GridLayout(3,1));
        /////////////////
        p1= new JPanel();
        p2= new JPanel();
        p3= new JPanel();       
        p2.setLayout(new GridLayout(1,2));     
        pa= new JPanel();
        pb= new JPanel();          
        p3.setLayout(new GridLayout(1,2));       
        pc= new JPanel();
        pd= new JPanel();
     
        
        
        j1= new JLabel();
        j1.setText("<html> <p style=\" text-align:center;color:purple;font-size:20px; \">How Many Birds are there?</p> </html>");
        
        
        
        b1= new JButton("8");
        b1.addActionListener(this);
        b2= new JButton("9");
        b2.addActionListener(this);
        b3= new JButton("10");
        b3.addActionListener(this);
        b4= new JButton("11");
        b4.addActionListener(this);
        
        
        pa.add(b1);
        pb.add(b2);
        pc.add(b3);
        pd.add(b4);
        
        p1.add(j1);
        p2.add(pa);
        p2.add(pb);
        p3.add(pc);
        p3.add(pd);
        
        jfm.add(p1);
        jfm.add(p2);
        jfm.add(p3);
        jfm.setVisible(true);
        score =s;
        
    }
    
    
     public void actionPerformed(ActionEvent ae)
    {
        EndTime=System.currentTimeMillis();
        NitTime=EndTime-StartTime;
        NitTime=(int)NitTime/1000;
        NitTime=NitTime+GotTime;
        
        if(ae.getSource() == b1)
        {
            JOptionPane.showMessageDialog(jfm,"Wrong Answer!!!");
            v5 ob= new v5(score,NitTime);                         
            jfm.setVisible(false);
        }
            
        else if(ae.getSource() == b2)
        {
           
            v5 ob= new v5(score+100,NitTime);                          
            jfm.setVisible(false);
            
            
        }  
        else if(ae.getSource() == b3)
        {
            JOptionPane.showMessageDialog(jfm,"Wrong Answer!!!");
            v5 ob= new v5(score,NitTime);                        
            jfm.setVisible(false);
        } 
        else if(ae.getSource() == b4)
        {
           JOptionPane.showMessageDialog(jfm,"Wrong Answer!!!");
            v5 ob= new v5(score,NitTime);                          
            jfm.setVisible(false);
        }   	
            
    }
    
    
    
    
    

    
    
    
}
