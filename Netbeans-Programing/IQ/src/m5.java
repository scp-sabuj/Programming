import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class m5 implements ActionListener
{
    JFrame jfm;
    JPanel p1,p2,p3,p4,p5,pa,pb,pc,pd,pe,pf;
    JLabel j1,j2,j3,j4;
    JTextField t1;
    JButton b1;
    ImageIcon img,img1;
    Random r,r1;
    int n,rn,rn1;
    String s1;
    
    
    public int score;
    long StartTime,EndTime,NitTime,GotTime;
    
    m5(int s, long t)
    {
        
        GotTime = t;
        StartTime=System.currentTimeMillis();
        score =s;
        jfm = new JFrame("Math Test");
        jfm.setSize(450,500);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setLayout(new GridLayout(2,1));
        
        r = new Random();
        r1 = new Random();
        rn = r.nextInt(101);
        rn1= r1.nextInt(101);
        
        while(rn>=rn1)
        {
            rn1=r1.nextInt(101);
        }
        
        p1 = new JPanel();
        j1 = new JLabel();
        img = new ImageIcon("img/5.jpeg");
        j1.setIcon(img);
        p1.add(j1);
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(2,3));
        pa = new JPanel();
        pb = new JPanel();
        pc = new JPanel();
        pd = new JPanel();
        pe = new JPanel();
        pf = new JPanel();
        
        t1 = new JTextField();
        t1.setColumns(5);
        
        
        j2 = new JLabel();
        j2.setText("+"+rn);
        j3 = new JLabel();
        j3.setText("="+rn1);
        //b1 = new JButton("Enter");
        //b1.addActionListener(this);
            
        
        
        pb.add(t1);
        pb.add(j2);
        pb.add(j3);
        b1 = new JButton();
        b1.addActionListener(this);
        img1 = new ImageIcon("img/b.png");
        b1.setIcon(img1);
        pe.add(b1);
        
        p2.add(pa);
        p2.add(pb);
        p2.add(pc);
        p2.add(pd);
        p2.add(pe);
        p2.add(pf);
        
        
        jfm.add(p1);
        jfm.add(p2);
        
        jfm.setVisible(true);
     }
    public void actionPerformed(ActionEvent ae)
    {
        EndTime=System.currentTimeMillis();
        NitTime=EndTime-StartTime;
        NitTime=(int)NitTime/1000;
        NitTime=NitTime+GotTime;
        
        n=50000;
        s1 = t1.getText();
        try {
            n = Integer.parseInt(s1);
        }catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(jfm,"Please enter a number");
            return;
        }
        
        if(rn1-rn==n)
        {
            JOptionPane.showMessageDialog(jfm,"100 Points added");
            m6 ob = new m6((score+100),NitTime);
            jfm.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(jfm,"Answer is "+(rn1-rn));
            m6 ob = new m6(score,NitTime);
            jfm.setVisible(false);
        }
    }
    
 
}
    
        
        