
package calculator;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
public class Calculate implements MenuListener,ActionListener
{
    JFrame f;
    JLabel l,l2;
    JMenuBar mb;
    JMenu m;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JTextField tf1,tf2,tf3;
    JPanel p,p2;
    Calculate(String op)
    {
        //Receving flag value from string op and checking manually 
        //For every checking there are different jrame structure with field
        if(op=="1")
        {
            
            f=new JFrame("Geometric Calculator");
            f.setSize(300,350);
            f.setResizable(false);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setLayout(new FlowLayout(200));

            mb=new JMenuBar();
            m=new JMenu("Home");
            m.addMenuListener(this);
            mb.add(m);
            f.setJMenuBar(mb);
            l=new JLabel("<html><center><h1 style=\"color:blue;margin-left:45px;margin-bottom:30px;\">Triangle Area</h1></center></html>");
            f.add(l);
            tf1=new JTextField();
            tf1.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;\">Base: &nbsp  </p></html>");
            f.add(l);
            f.add(tf1);
            tf2=new JTextField();
            tf2.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;\">Height: </p></html>");
            f.add(l);
            f.add(tf2);
            b1=new JButton("Answer");
            b1.addActionListener(this);
            p=new JPanel();
            p.setLayout(new GridLayout(3,1));
            l=new JLabel("");
            p.add(l);
            p2=new JPanel();
            p2.setLayout(new GridLayout(1,4));
            l=new JLabel("");
            p2.add(l);
            l=new JLabel("");
            p2.add(l);
            p2.add(b1);
            l=new JLabel("");
            p2.add(l);
            p.add(p2);
            l2=new JLabel("");
            p.add(l2);
            f.add(p);
            
            
            f.setVisible(true);
        }
        
        if(op=="2")
        {
            
            f=new JFrame("Geometric Calculator");
            f.setSize(300,350);
            f.setResizable(false);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setLayout(new FlowLayout(200));

            mb=new JMenuBar();
            m=new JMenu("Home");
            m.addMenuListener(this);
            mb.add(m);
            f.setJMenuBar(mb);
            l=new JLabel("<html><center><h1 style=\"color:blue;margin-left:45px;margin-bottom:30px;\">Rectangle Area</h1></center></html>");
            f.add(l);
            tf1=new JTextField();
            tf1.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;\">Width: &nbsp </p></html>");
            f.add(l);
            f.add(tf1);
            tf2=new JTextField();
            tf2.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;\">Length: </p></html>");
            f.add(l);
            f.add(tf2);
            b2=new JButton("Answer");
            b2.addActionListener(this);
            p=new JPanel();
            p.setLayout(new GridLayout(3,1));
            l=new JLabel("");
            p.add(l);
            p2=new JPanel();
            p2.setLayout(new GridLayout(1,4));
            l=new JLabel("");
            p2.add(l);
            l=new JLabel("");
            p2.add(l);
            p2.add(b2);
            l=new JLabel("");
            p2.add(l);
            p.add(p2);
            l2=new JLabel("");
            p.add(l2);
            f.add(p);
            
            
            f.setVisible(true);
        }
        
        
        if(op=="3")
        {
            
            f=new JFrame("Geometric Calculator");
            f.setSize(300,350);
            f.setResizable(false);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setLayout(new FlowLayout(200));

            mb=new JMenuBar();
            m=new JMenu("Home");
            m.addMenuListener(this);
            mb.add(m);
            f.setJMenuBar(mb);
            l=new JLabel("<html><center><h1 style=\"color:blue;margin-left:45px;margin-bottom:30px;\">Trapezium Area</h1></center></html>");
            f.add(l);
            tf1=new JTextField();
            tf1.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;margin-right:60px;\">a: </p></html>");
            f.add(l);
            f.add(tf1);
            tf2=new JTextField();
            tf2.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;margin-right:60px;\">b: </p></html>");
            f.add(l);
            f.add(tf2);
            tf3=new JTextField();
            tf3.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;margin-right:60px;\">h: </p></html>");
            f.add(l);
            f.add(tf3);
            b3=new JButton("Answer");
            b3.addActionListener(this);
            p=new JPanel();
            p.setLayout(new GridLayout(3,1));
            l=new JLabel("");
            p.add(l);
            p2=new JPanel();
            p2.setLayout(new GridLayout(1,4));
            l=new JLabel("");
            p2.add(l);
            l=new JLabel("");
            p2.add(l);
            p2.add(b3);
            l=new JLabel("");
            p2.add(l);
            p.add(p2);
            l2=new JLabel("");
            p.add(l2);
            f.add(p);
            
            
            f.setVisible(true);
        }
        
        if(op=="4")
        {
            
            f=new JFrame("Geometric Calculator");
            f.setSize(300,350);
            f.setResizable(false);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setLayout(new FlowLayout(200));

            mb=new JMenuBar();
            m=new JMenu("Home");
            m.addMenuListener(this);
            mb.add(m);
            f.setJMenuBar(mb);
            l=new JLabel("<html><center><h1 style=\"color:blue;margin-left:45px;margin-bottom:30px;\">Ellipse Area</h1></center></html>");
            f.add(l);
            tf1=new JTextField();
            tf1.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:70px;\">a: </p></html>");
            f.add(l);
            f.add(tf1);
            tf2=new JTextField();
            tf2.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:70px;\">b: </p></html>");
            f.add(l);
            f.add(tf2);
            b4=new JButton("Answer");
            b4.addActionListener(this);
            p=new JPanel();
            p.setLayout(new GridLayout(3,1));
            l=new JLabel("");
            p.add(l);
            p2=new JPanel();
            p2.setLayout(new GridLayout(1,4));
            l=new JLabel("");
            p2.add(l);
            l=new JLabel("");
            p2.add(l);
            p2.add(b4);
            l=new JLabel("");
            p2.add(l);
            p.add(p2);
            l2=new JLabel("");
            p.add(l2);
            f.add(p);
            
            
            f.setVisible(true);
        }
        if(op=="5")
        {
            
            f=new JFrame("Geometric Calculator");
            f.setSize(300,350);
            f.setResizable(false);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setLayout(new FlowLayout(200));

            mb=new JMenuBar();
            m=new JMenu("Home");
            m.addMenuListener(this);
            mb.add(m);
            f.setJMenuBar(mb);
            l=new JLabel("<html><center><h1 style=\"color:blue;margin-left:45px;margin-bottom:30px;\">Square Area</h1></center></html>");
            f.add(l);
            tf1=new JTextField();
            tf1.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:70px;\">a: &nbsp  </p></html>");
            f.add(l);
            f.add(tf1);
            b5=new JButton("Answer");
            b5.addActionListener(this);
            p=new JPanel();
            p.setLayout(new GridLayout(3,1));
            l=new JLabel("");
            p.add(l);
            p2=new JPanel();
            p2.setLayout(new GridLayout(1,4));
            l=new JLabel("");
            p2.add(l);
            l=new JLabel("");
            p2.add(l);
            p2.add(b5);
            l=new JLabel("");
            p2.add(l);
            p.add(p2);
            l2=new JLabel("");
            p.add(l2);
            f.add(p);
            
            
            f.setVisible(true);
        }
        if(op=="6")
        {
            
            f=new JFrame("Geometric Calculator");
            f.setSize(300,350);
            f.setResizable(false);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setLayout(new FlowLayout(200));

            mb=new JMenuBar();
            m=new JMenu("Home");
            m.addMenuListener(this);
            mb.add(m);
            f.setJMenuBar(mb);
            l=new JLabel("<html><center><h1 style=\"color:blue;margin-left:20px;margin-bottom:30px;\">Parallelogram Area</h1></center></html>");
            f.add(l);
            tf1=new JTextField();
            tf1.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;\">Base: &nbsp </p></html>");
            f.add(l);
            f.add(tf1);
            tf2=new JTextField();
            tf2.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;\">Height: </p></html>");
            f.add(l);
            f.add(tf2);
            b6=new JButton("Answer");
            b6.addActionListener(this);
            p=new JPanel();
            p.setLayout(new GridLayout(3,1));
            l=new JLabel("");
            p.add(l);
            p2=new JPanel();
            p2.setLayout(new GridLayout(1,4));
            l=new JLabel("");
            p2.add(l);
            l=new JLabel("");
            p2.add(l);
            p2.add(b6);
            l=new JLabel("");
            p2.add(l);
            p.add(p2);
            l2=new JLabel("");
            p.add(l2);
            f.add(p);
            
            
            f.setVisible(true);
        }
        
        if(op=="7")
        {
            
            f=new JFrame("Geometric Calculator");
            f.setSize(300,350);
            f.setResizable(false);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setLayout(new FlowLayout(200));

            mb=new JMenuBar();
            m=new JMenu("Home");
            m.addMenuListener(this);
            mb.add(m);
            f.setJMenuBar(mb);
            l=new JLabel("<html><center><h1 style=\"color:blue;margin-left:55px;margin-bottom:30px;\">Circle Area</h1></center></html>");
            f.add(l);
            tf1=new JTextField();
            tf1.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;\">Radius: </p></html>");
            f.add(l);
            f.add(tf1);
            b7=new JButton("Answer");
            b7.addActionListener(this);
            p=new JPanel();
            p.setLayout(new GridLayout(3,1));
            l=new JLabel("");
            p.add(l);
            p2=new JPanel();
            p2.setLayout(new GridLayout(1,4));
            l=new JLabel("");
            p2.add(l);
            l=new JLabel("");
            p2.add(l);
            p2.add(b7);
            l=new JLabel("");
            p2.add(l);
            p.add(p2);
            l2=new JLabel("");
            p.add(l2);
            f.add(p);
            
            
            f.setVisible(true);
        }
        
        if(op=="8")
        {
            
            f=new JFrame("Geometric Calculator");
            f.setSize(300,350);
            f.setResizable(false);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setLayout(new FlowLayout(200));

            mb=new JMenuBar();
            m=new JMenu("Home");
            m.addMenuListener(this);
            mb.add(m);
            f.setJMenuBar(mb);
            l=new JLabel("<html><center><h1 style=\"color:blue;margin-left:18px;margin-bottom:30px;\">Circle Circumference</h1></center></html>");
            f.add(l);
            tf1=new JTextField();
            tf1.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;\">Radius: </p></html>");
            f.add(l);
            f.add(tf1);
            b8=new JButton("Answer");
            b8.addActionListener(this);
            p=new JPanel();
            p.setLayout(new GridLayout(3,1));
            l=new JLabel("");
            p.add(l);
            p2=new JPanel();
            p2.setLayout(new GridLayout(1,4));
            l=new JLabel("");
            p2.add(l);
            l=new JLabel("");
            p2.add(l);
            p2.add(b8);
            l=new JLabel("");
            p2.add(l);
            p.add(p2);
            l2=new JLabel("");
            p.add(l2);
            f.add(p);
            
            
            f.setVisible(true);
        }
        
        if(op=="9")
        {
            
            f=new JFrame("Geometric Calculator");
            f.setSize(300,350);
            f.setResizable(false);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setLayout(new FlowLayout(200));

            mb=new JMenuBar();
            m=new JMenu("Home");
            m.addMenuListener(this);
            mb.add(m);
            f.setJMenuBar(mb);
            l=new JLabel("<html><center><h1 style=\"color:blue;margin-left:45px;margin-bottom:30px;\">Circle Sector</h1></center></html>");
            f.add(l);
            tf1=new JTextField();
            tf1.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;margin-right:10px;\">Radius: </p></html>");
            f.add(l);
            f.add(tf1);
            tf2=new JTextField();
            tf2.setColumns(10);
            l=new JLabel("<html><p style=\"font-size:14px;margin-left:40px;margin-right:10px;\">Angel: &nbsp </p></html>");
            f.add(l);
            f.add(tf2);
            b9=new JButton("Answer");
            b9.addActionListener(this);
            p=new JPanel();
            p.setLayout(new GridLayout(3,1));
            l=new JLabel("");
            p.add(l);
            p2=new JPanel();
            p2.setLayout(new GridLayout(1,4));
            l=new JLabel("");
            p2.add(l);
            l=new JLabel("");
            p2.add(l);
            p2.add(b9);
            l=new JLabel("");
            p2.add(l);
            p.add(p2);
            l2=new JLabel("");
            p.add(l2);
            f.add(p);
            
            
            f.setVisible(true);
        }
    }

    @Override
    public void menuSelected(MenuEvent e) 
    {
        //When select home at menu from any frame structure then it will action like below
        f.setVisible(false);
        Calculator ob=new Calculator();
    }

    @Override
    public void menuDeselected(MenuEvent e) 
    {
        
    }

    @Override
    public void menuCanceled(MenuEvent e) 
    {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //Here also 9 buttons for 9 frame so 9 different action with calculation
        if(e.getSource()==b1)
        {
            String s1=tf1.getText().trim();
            String s2=tf2.getText().trim();
            try
            {
                double n1=Double.parseDouble(s1);
                double n2=Double.parseDouble(s2);
                double area=(.5*n1*n2);
                l2.setText("<html><h4 style=\"margin-left:50px;\">Answer: <font color=\"red\">"+area+"</font></h2></html>");
            }catch(NumberFormatException ie)
            {
                JOptionPane.showMessageDialog(f,"Please provide a value!!!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==b2)
        {
            String s1=tf1.getText().trim();
            String s2=tf2.getText().trim();
            try
            {
                double n1=Double.parseDouble(s1);
                double n2=Double.parseDouble(s2);
                double area=(n1*n2);
                l2.setText("<html><h4 style=\"margin-left:50px;\">Answer: <font color=\"red\">"+area+"</font></h2></html>");
            }catch(NumberFormatException ie)
            {
                JOptionPane.showMessageDialog(f,"Please provide a value!!!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==b3)
        {
            String s1=tf1.getText().trim();
            String s2=tf2.getText().trim();
            String s3=tf3.getText().trim();
            try
            {
                double n1=Double.parseDouble(s1);
                double n2=Double.parseDouble(s2);
                double n3=Double.parseDouble(s3);
                double area=(.5*(n1+n2)*n3);
                l2.setText("<html><h4 style=\"margin-left:50px;\">Answer: <font color=\"red\">"+area+"</font></h2></html>");
            }catch(NumberFormatException ie)
            {
                JOptionPane.showMessageDialog(f,"Please provide a value!!!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==b4)
        {
            String s1=tf1.getText().trim();
            String s2=tf2.getText().trim();
            try
            {
                double n1=Double.parseDouble(s1);
                double n2=Double.parseDouble(s2);
                double area=3.1416*(n1*n2);
                l2.setText("<html><h4 style=\"margin-left:50px;\">Answer: <font color=\"red\">"+area+"</font></h2></html>");
            }catch(NumberFormatException ie)
            {
                JOptionPane.showMessageDialog(f,"Please provide a value!!!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==b5)
        {
            String s1=tf1.getText().trim();
            try
            {
                double n1=Double.parseDouble(s1);
                double area=(n1*n1);
                l2.setText("<html><h4 style=\"margin-left:50px;\">Answer: <font color=\"red\">"+area+"</font></h2></html>");
            }catch(NumberFormatException ie)
            {
                JOptionPane.showMessageDialog(f,"Please provide a value!!!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==b6)
        {
            String s1=tf1.getText().trim();
            String s2=tf2.getText().trim();
            try
            {
                double n1=Double.parseDouble(s1);
                double n2=Double.parseDouble(s2);
                double area=(n1*n2);
                l2.setText("<html><h4 style=\"margin-left:50px;\">Answer: <font color=\"red\">"+area+"</font></h2></html>");
            }catch(NumberFormatException ie)
            {
                JOptionPane.showMessageDialog(f,"Please provide a value!!!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==b7)
        {
            String s1=tf1.getText().trim();
            try
            {
                double n1=Double.parseDouble(s1);
                double area=3.1416*(n1*n1);
                l2.setText("<html><h4 style=\"margin-left:50px;\">Answer: <font color=\"red\">"+area+"</font></h2></html>");
            }catch(NumberFormatException ie)
            {
                JOptionPane.showMessageDialog(f,"Please provide a value!!!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==b8)
        {
            String s1=tf1.getText().trim();
            try
            {
                double n1=Double.parseDouble(s1);
                double area=2*3.1416*n1;
                l2.setText("<html><h4 style=\"margin-left:50px;\">Answer: <font color=\"red\">"+area+"</font></h2></html>");
            }catch(NumberFormatException ie)
            {
                JOptionPane.showMessageDialog(f,"Please provide a value!!!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==b9)
        {
            String s1=tf1.getText().trim();
            String s2=tf2.getText().trim();
            try
            {
                double n1=Double.parseDouble(s1);
                double n2=Double.parseDouble(s2);
                double area=.5*(n1*n1)*n2;
                l2.setText("<html><h4 style=\"margin-left:50px;\">Answer: <font color=\"red\">"+area+"</font></h2></html>");
            }catch(NumberFormatException ie)
            {
                JOptionPane.showMessageDialog(f,"Please provide a value!!!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
