package java_project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Java_Project extends JFrame {
    private JLabel l1;
    private JButton b1,b2;
    public Java_Project()
    {
        setLayout(new GridLayout(3,1));
        l1=new JLabel("S & R Departmetal Store");
        l1.setHorizontalTextPosition(JLabel.CENTER);
        Border bro=BroderFactrory.createLineBorder(Color.BLACK);
        l1.setBorder(bro);
        l1.setPreferredSize(new Dimension(1500, 1000));
         add(l1);
        b1=new JButton("1.Costromar");
        add(b1);
        b2=new JButton("2.Shopkepper");
        add(b2);
    }

    public static void main(String[] args) {
        Java_Project obj = new Java_Project();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setVisible(true);
        obj.setSize(600, 400);
        obj.setTitle("This is main page");
        
    }

}
