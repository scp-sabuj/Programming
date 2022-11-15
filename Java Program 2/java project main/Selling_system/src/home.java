import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
public class home implements ActionListener
{
    JFrame jfm;
    JPanel jp,jp1,jp2,jp3;
    JLabel jl1;
    JTextField jtf1;
    JButton b1,b2;
    ImageIcon img;
    static ArrayList arr,arr2;
    home(ArrayList arr)
    {
        arr2=arr;
        jfm=new JFrame("Selling System");
        jfm.setSize(500,500);
        jfm.setResizable(false);
        jfm.setLocationRelativeTo(null);
        jfm.setDefaultCloseOperation(jfm.EXIT_ON_CLOSE);
        
        jfm.setLayout(new GridLayout(2,1));
        
        
        jp1=new JPanel();
        jp2=new JPanel();
        img=new ImageIcon("image/logo.jpg");
        jl1=new JLabel();
        jl1.setIcon(img);
        jp1.add(jl1);
        jfm.add(jp1);
        jp2.setLayout(new GridLayout(3,1));
        jl1=new JLabel(" ");
        jp2.add(jl1);
        jp3=new JPanel();
        jp3.setLayout(new GridLayout(1,5));
        jl1=new JLabel(" ");
        jp3.add(jl1);
        b1=new JButton("Customer");
        b1.addActionListener(this);
        jp3.add(b1);
        jl1=new JLabel(" ");
        jp3.add(jl1);
        b2=new JButton("Shopkeeper");
        b2.addActionListener(this);
        jp3.add(b2);
        jl1=new JLabel(" ");
        jp3.add(jl1);
        jp2.add(jp3);
        jl1=new JLabel(" ");
        jp2.add(jl1);
        jfm.add(jp2);
        
        jfm.setVisible(true);
    }
    
    public static void main(String args[])
    {
        arr=new ArrayList();
        arr.add(" Potato ");
        arr.add("20");
        arr.add(" Rice ");
        arr.add("38");
        arr.add("Oil");
        arr.add("100");
        arr.add("Soap");
        arr.add("28");
        arr.add("Suger");
        arr.add("44");
        arr.add("Dal");
        arr.add("130");
        arr.add("Egg");
        arr.add("10");
        arr.add("Flour");
        arr.add("40");
        arr.add("Solt");
        arr.add("25");
        
        
        
        home ob=new home(arr);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            jfm.setVisible(false);
            customer ob=new customer(arr2);
        }
        if(e.getSource()==b2)
        {
            jfm.setVisible(false);
            shopkeeper ob=new shopkeeper(arr2);
        }
        
        
    }
}