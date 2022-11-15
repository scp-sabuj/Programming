
package calculator;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Calculator implements ActionListener
{
    JFrame f;
    JLabel l;
    JPanel p,bp;
    ImageIcon i;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Calculator()
    {
        //Adding frame with title and image
        f=new JFrame("Geometric Calculator");
        f.setSize(800,600);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(new GridLayout(2,1));
        l=new JLabel("<html><h1 style=\"color:red;font-size:30px;margin-top:5px;\">Geometric Calculator</h1></html>");
        p=new JPanel();
        p.setLayout(new FlowLayout());
        p.add(l);
        f.add(p);
        i=new ImageIcon("image/first.jpg");
        l=new JLabel("");
        l.setIcon(i);
        p.add(l);
        f.add(p);
        
        //Adding buttons with 2 panel
        p=new JPanel();
        p.setLayout(new GridLayout(7,1));
        l=new JLabel("");
        p.add(l);
        
        bp=new JPanel();
        bp.setLayout(new GridLayout(1,7));
        l=new JLabel("");
        bp.add(l);
        l=new JLabel("<html><center><p>Triangle</p><p>Area</p></center></html>");
        b1=new JButton();
        String str1=(String) l.getText();
        b1.setText(str1);
        b1.addActionListener(this);
        bp.add(b1);
        l=new JLabel("");
        bp.add(l);
        l=new JLabel("<html><center><p>Rectangle</p><p>Area</p></center></html>");
        b2=new JButton();
        String str2=(String) l.getText();
        b2.setText(str2);
        b2.addActionListener(this);
        bp.add(b2);
        l=new JLabel("");
        bp.add(l);
        l=new JLabel("<html><center><p>Trapezium</p><p>Area</p></center></html>");
        b3=new JButton();
        String str3=(String) l.getText();
        b3.setText(str3);
        b3.addActionListener(this);
        bp.add(b3);
        l=new JLabel("");
        bp.add(l);
        p.add(bp);
        l=new JLabel("");
        p.add(l);

        bp=new JPanel();
        bp.setLayout(new GridLayout(1,7));
        l=new JLabel("");
        bp.add(l);
        l=new JLabel("<html><center><p>Ellipse</p><p>Area</p></center></html>");
        b4=new JButton();
        String str4=(String) l.getText();
        b4.setText(str4);
        b4.addActionListener(this);
        bp.add(b4);
        l=new JLabel("");
        bp.add(l);
        l=new JLabel("<html><center><p>Square</p><p>Area</p></center></html>");
        b5=new JButton();
        String str5=(String) l.getText();
        b5.setText(str5);
        b5.addActionListener(this);
        bp.add(b5);
        l=new JLabel("");
        bp.add(l);
        l=new JLabel("<html><center><p>Parallelogram</p><p>Area</p></center></html>");
        b6=new JButton();
        String str6=(String) l.getText();
        b6.setText(str6);
        b6.addActionListener(this);
        bp.add(b6);
        l=new JLabel("");
        bp.add(l);
        p.add(bp);
        l=new JLabel("");
        p.add(l);
        
        bp=new JPanel();
        bp.setLayout(new GridLayout(1,7));
        l=new JLabel("");
        bp.add(l);
        l=new JLabel("<html><center><p>Circle</p><p>Area</p></center></html>");
        b7=new JButton();
        String str7=(String) l.getText();
        b7.setText(str7);
        b7.addActionListener(this);
        bp.add(b7);
        l=new JLabel("");
        bp.add(l);
        l=new JLabel("<html><center><p>Circle</p><p>Circumference</p></center></html>");
        b8=new JButton();
        String str8=(String) l.getText();
        b8.setText(str8);
        b8.addActionListener(this);
        bp.add(b8);
        l=new JLabel("");
        bp.add(l);
        l=new JLabel("<html><center><p>Circle</p><p>Sector</p></center></html>");
        b9=new JButton();
        String str9=(String) l.getText();
        b9.setText(str9);
        b9.addActionListener(this);
        bp.add(b9);
        l=new JLabel("");
        bp.add(l);
        p.add(bp);
        l=new JLabel("");
        p.add(l);
        
        
        f.add(p);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        Calculator ob=new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //9 button 9 action with a string flag value(ex. 1,2..)
        if(e.getSource()==b1)
        {
            f.setVisible(false);
            Calculate ob=new Calculate("1");
        }
        if(e.getSource()==b2)
        {
            f.setVisible(false);
            Calculate ob=new Calculate("2");
        }
        if(e.getSource()==b3)
        {
            f.setVisible(false);
             Calculate ob=new Calculate("3");
        }
         if(e.getSource()==b4)
        {
            f.setVisible(false);
             Calculate ob=new Calculate("4");
        }
        if(e.getSource()==b5)
        {
            f.setVisible(false);
            Calculate ob=new Calculate("5");
        }
        if(e.getSource()==b6)
        {
            f.setVisible(false);
             Calculate ob=new Calculate("6");
        }
        if(e.getSource()==b7)
        {
            f.setVisible(false);
            Calculate ob=new Calculate("7");
        }
        if(e.getSource()==b8)
        {
            f.setVisible(false);
            Calculate ob=new Calculate("8");
        }
        if(e.getSource()==b9)
        {
            f.setVisible(false);
             Calculate ob=new Calculate("9");
        }
    }
}

